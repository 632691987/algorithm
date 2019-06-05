package algorithm.classic;


import org.junit.Test;

/**
 * 八个皇后不能同一直线，不能同一竖线，不能同一邪线
 */
public class EightQueues {

    int max = 8;
    int[] array = new int[max];
    static int count = 0;

    @Test
    public void testDemo() {
        check(0);
    }

    private void check(int n) {
        if(n==max) {
            print();
            return;
        }

        for(int i = 0; i < max; i++) {
            array[n] = i;
            if(judge(n)) {
                check(n+1);
            }
        }
    }

    private boolean judge(int n) {
        for(int i = 0; i < n; i++) {
            if(array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        for(int num : array) {
            System.out.printf("%d\t", num);
        }
        System.out.println();
    }

}
