class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];


        int max = 0;
        maxLeft[0] = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i-1] > max) {
                max = height[i-1];
            }
            maxLeft[i] = max;
        }

        max = 0;
        maxRight[maxRight.length-1] = 0;

        for (int i = height.length-2; i >= 0; i--) {
            if (height[i+1] > max) {
                max = height[i+1];
            }
            maxRight[i] = max;
        }

        int sol = 0;

        for (int i = 0; i < height.length; i++) {
            int minLR = Math.min(maxLeft[i], maxRight[i]);
            if (minLR - height[i] > 0) {
                sol = sol + minLR - height[i];
            }
        }

        return sol;

    }
}
