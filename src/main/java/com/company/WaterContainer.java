package com.company;

public class WaterContainer {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] > height[right]) {
                int area = height[right] * (right - left);
                max = Math.max(area, max);
                right--;
            } else {
                int area = height[left] * (right - left);
                max = Math.max(area, max);
                left++;
            }
        }

        return max;
    }
}
