package algorithm.sorting;

public class ChooseSorting extends SortInterface {

    //核心思想：
    //第一次，找到最少得，然后跟数组第一个数字交换

	@Override
	public void coreAlorithm(int[] arr) {
        int min, flag = 0, temp;
        for(int x = 0; x < arr.length; x++) {
            min = Integer.MAX_VALUE;
            for(int y = x; y < arr.length; y++) {
                if(arr[y] < min) {
                    min = arr[y];
                    flag = y;
                }
            }
            temp = arr[x];
            arr[x] = min;
            arr[flag] = temp;
        }
	}

}
