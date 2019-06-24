package interview;

public class Test1 {

	public static void main(String[] args) {
		int i = 1;
		i = i++;
		int j = i++;
		int k = i + ++i * i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		
		Object m = null;
		if (m == null) {
			synchronized(new Object()) {
				if (m == null) {
					m = new Object();
				}
			}
		}
	}
	
	/**
	 * int k = i + ++i * i++;
	 * 1, 首先是从左到右 ==> int k = 2 + ++i * i++;
	 * 2,还是从左到右  ==> int k = 2 + 3 * i++;
	 * 由于有个 ++i, 所以那一瞬间，i = 3 了。然后才到计算 i++;
	 * 而由于 i++的出现，变成 int k = 2 + 3 * 3; i 最后变成4
	 */

}
