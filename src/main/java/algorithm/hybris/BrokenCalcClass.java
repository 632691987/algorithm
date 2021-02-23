package algorithm.hybris;

import org.junit.Test;

public class BrokenCalcClass {

    public int brokenCalc(int x, int y) {
        int count = 0;

        while (x != y) {

            if (x > y) {
                count = count + (x - y);
                break;
            }

            x = x * 2;
            count ++;
        }

        return count;
    }

    private int choice1(int x) {
        return x * 2;
    }

    private int choice2(int x) {
        return (x - 1) * 2;
    }

    private int choice3(int x) {
        return x * 2 - 1;
    }

    @Test
    public void test1() {
        System.out.println(brokenCalc(5, 5118));
    }
}
