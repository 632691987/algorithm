package algorithm.sorting;

import java.util.Arrays;

import org.junit.Test;

/**
 * 希尔排序
 */
public class DibakdShellSort {
	
	// 0 1 2 3 4 5 6 7 8 9 10
	public void coreAlorithm(int[] arr) {
		int temp = 0;
		int gap = arr.length;
		for(gap = gap / 2; gap > 0; gap = gap / 2) {
			for(int i = gap; i < arr.length; i++) {
				for(int j = i - gap; j >= 0; j= j -gap) {
					
					int left  = j;
					int right = j + gap;
					
					if(arr[left] > arr[right]) {
						temp = arr[left];
						arr[left] = arr[right];
						arr[right] = temp;
					}
				}
			}
		}
	}

	@Test
	public void test1() {
		int[] arr = new int[] { 3, 0, 1, 8, 7, 2, 5, 4, 9, 6 };
		coreAlorithm(arr);
	}

}
