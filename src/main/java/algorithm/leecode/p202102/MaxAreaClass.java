package algorithm.leecode.p202102;

public class MaxAreaClass {

    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        for (int indexA = 0; indexA < height.length; indexA++ ) {
            for (int indexB = 0; indexB < height.length; indexB++ ) {
                if (indexA == indexB) {
                    continue;
                }

                int width = Math.abs(indexA - indexB);
                int minHeight = Math.min(height[indexA], height[indexB]);

                int s = minHeight * width;

                if (s > max) {
                    max = s;
                }
            }
        }
        return max;
    }


}
