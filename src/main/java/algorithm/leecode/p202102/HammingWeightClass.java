package algorithm.leecode.p202102;

import org.junit.Test;

public class HammingWeightClass {
    public int hammingWeight(int n) {
        int res = 0;
        while(n!=0) {
            res+= (n & 0x1);
            n >>>=1;
        }
        return res;
    }

    @Test
    public void test1() {
        System.out.println(hammingWeight(31));
    }
}
