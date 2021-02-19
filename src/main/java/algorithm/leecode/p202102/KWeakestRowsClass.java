package algorithm.leecode.p202102;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KWeakestRowsClass {

    static class ComparableRow implements Comparable{

        private int weight;
        private int index;

        public ComparableRow(int weight, int index) {
            this.weight = weight;
            this.index = index;
        }

        @Override
        public int compareTo(final Object o) {
            ComparableRow other = (ComparableRow)o;

            if (this.weight != other.weight) {
                return this.weight - other.weight;
            }

            return this.index - other.index;
        }

        public int getIndex() {
            return index;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<ComparableRow> priorityQueue = new PriorityQueue();

        int m = mat.length;
        int n = mat[0].length;

        for (int index = 0; index < m; index ++) {
            int[] _arr = mat[index];
            int count = 0;
            for (int loop = 0; loop < n; loop++) {
                if (_arr[loop] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            priorityQueue.offer(new ComparableRow(count, index));
        }

        int[] result = new int[k];
        for (int index = 0; index < result.length; index ++) {
            result[index] = priorityQueue.poll().getIndex();
        }
        return result;
    }

    @Test
    public void test1() {
        kWeakestRows(null, 10);
    }
}
