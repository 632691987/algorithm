package algorithm.leecode.p202102;

public class NumberOfArithmeticSlices {

    public int numberOfArithmeticSlices(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int gap = array.length - 1;
        int length = array.length;
        int count = 0;

        reverse(array);

        while (gap > 0) {
            for (int index = 0; index < length; index++) {
                int startCount = index + 2 * gap;
                if (length - 1 < startCount) {
                    break;
                }
                int _count = ((length - 1) - startCount) / gap + 1;
                if (_count == 0) {
                    break;
                }
                count = count + _count;
            }
            gap--;
        }
        return count;
    }

    public void reverse(int[] array) {
        if (array[0] > array[array.length - 1]) {
            for (int index = 0; index < (array.length - 1) / 2; index++) {
                int temp = array[array.length - 1 - index];
                array[array.length - 1 - index] = array[index];
                array[index] = temp;
            }
        }
    }
}
