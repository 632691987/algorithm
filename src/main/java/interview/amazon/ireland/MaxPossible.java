package interview.amazon.ireland;

import org.junit.Test;

public class MaxPossible
{
    public int solution(int N)
    {
        int insertValue = 5;
        String returnValue = "";
        boolean isPositive = true;
        if (N < 0)
        {
            isPositive = false;
            N = -1 * N;
        }

        String value = String.valueOf(N);
        int finalIndex = -1;
        for (int index = 0; index < value.length(); index++)
        {
            int temp = (int) value.charAt(index) - (int) '0';
            if (isPositive) {
                if (insertValue > temp)
                {
                    finalIndex = index;
                    break;
                }
            }
            else {
                if (insertValue < temp) {
                    finalIndex = index;
                    break;
                }
            }

        }
        if (finalIndex == -1)
        {
            returnValue = value + insertValue;
        }
        else
        {
            returnValue = value.substring(0, finalIndex) + insertValue + value.substring(finalIndex);
        }

        if (!isPositive) {
            return -1 * Integer.parseInt(returnValue);
        }

        return Integer.parseInt(returnValue);
    }

    @Test
    public void test1()
    {
        System.out.println(solution(0));
    }
}
