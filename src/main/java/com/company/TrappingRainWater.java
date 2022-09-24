package com.company;

import java.util.Arrays;

public class TrappingRainWater {

    public int trap(int[] height) {
        int[] maxLeftofIndex = new int[height.length];
        int[] maxRightofIndex = new int[height.length];

        maxLeftofIndex[0] = height[0];
        maxRightofIndex[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++){
            maxLeftofIndex[i] = Math.max(maxLeftofIndex[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            maxRightofIndex[i] = Math.max(maxRightofIndex[i + 1], height[i]);
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(maxLeftofIndex[i], maxRightofIndex[i]) - height[i];
        }

        return sum;
    }
}
