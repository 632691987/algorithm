package algorithm.sorting;


import org.junit.Test;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSortingDemo {

    @Test
    public void testDemo() {
        int[] arr = new int[]{1,2,4,3,5};

        int n = arr.length;
        int temp;
        for(int i = 0; i < n; i++) {
            boolean hasChanged = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    hasChanged = true;
                }
            }
            if(!hasChanged) break;
        }
        System.out.println(Arrays.toString(arr));
    }


}
