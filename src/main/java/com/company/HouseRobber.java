package com.company;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        Integer[] memo = new Integer[nums.length];
        return maxRobFrom(0, nums, memo);
    }

    private int maxRobFrom(int index, int[] nums, Integer[] memo) {
        if (memo[index] != null) {
            return memo[index];
        } else {
            if (index == nums.length - 1) {
                memo[index] = nums[index];
                return memo[index];
            }
            if (index == nums.length - 2) {
                memo[index] = Math.max(nums[index], nums[index + 1]);
                return memo[index];
            }

            memo[index] = Math.max(maxRobFrom(index + 1, nums, memo), nums[index] + maxRobFrom(index + 2, nums, memo));
            return memo[index];
        }
    }
}
