package interview.amazon.ireland;

import org.junit.Test;

public class Solution
{

    public int solution(int[] A)
    {
        int count = 0;
        if (A.length < 3)
        {
            return count;
        }

        int stableCount = 0;
        int previousV = A[1] - A[0];
        for (int index = 2; index < A.length; index++)
        {
            int currentV = A[index] - A[index - 1];
            if (previousV == currentV)
            {
                stableCount++;
            }
            else
            {
                if (stableCount > 0)
                {
                    if (stableCount == 1)
                    {
                        count++;
                    }
                    else
                    {
                        count = count + Combination(stableCount + 1, 2);
                    }

                }
                stableCount = 0;
            }
            previousV = currentV;
        }

        if (stableCount > 0)
        {
            if (stableCount == 1)
            {
                count++;
            }
            else
            {
                count = count + Combination(stableCount + 1, 2);
            }

        }

        return count > 1_000_000_000 ? -1 : count;
    }

    private int Combination(int n, int k)
    {
        int a = 1, b = 1;
        if (k > n / 2)
        {
            k = n - k;
        }
        for (int i = 1; i <= k; i++)
        {
            a *= (n + 1 - i);
            b *= i;
        }
        return a / b;
    }

    @Test
    public void test1()
    {
        int[] a = new int[] { -1, 1, 3, 3, 3, 2, 3, 2, 1, 0 };
        System.out.println(solution(a));
    }
}