package algorithm.sorting;

import java.util.Arrays;

import org.junit.Test;

/**
 * 一开始，把一个列变成两部分：
 * 1）无序队列(有N-1个元素)
 * 2）有序队列（只有一个元素）
 * 
 * 然后逐步把每个元素从无序队列拉到有序队列
 *
 */
public class InsertSortingDemo extends SortInterface {
	
	public void coreAlorithm(int[] arr) {
		for(int index = 1; index < arr.length; index ++) {
			int insertVal = arr[index];
			int insertIndex = index - 1;
			while( insertIndex >= 0 && insertVal < arr[insertIndex] ) {
				arr[insertIndex+1] =  arr[insertIndex];
				arr[insertIndex] = insertVal;
				insertIndex --;
			}
		}
	}

}
