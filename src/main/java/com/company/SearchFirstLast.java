package com.company;

public class SearchFirstLast {
    public static int[] searchRange(int[] nums, int target) {
        int left = -1;
        int right = -1;

        if (nums.length == 0) {
            return new int[]{-1,-1};
        }

        if (nums.length == 1) {
            return nums[0] == target ? new int[] {0,0} : new int[] {-1,-1};
        }

        int mid = (nums.length - 1) / 2;
        int tempIndex = -1;
        int tempLeft = 0;
        int tempRight = nums.length - 1;
        while (tempIndex == -1) {
            if (nums[mid] == target) {
                tempIndex = mid;
            }
            if (tempRight - tempLeft <= 1) {
                if (nums[tempLeft] == target) {
                    tempIndex = tempLeft;
                } else if (nums[tempRight] == target) {
                    tempIndex = tempRight;
                }
                break;
            }
            if (mid == 0 || mid == nums.length - 1) {
                break;
            }
            if (nums[mid] < target) {
                tempLeft = mid;
                mid = (tempRight + mid) / 2 == mid ? mid + 1: (tempRight + mid) / 2;
            } else if (nums[mid] > target) {
                tempRight = mid;
                mid = (tempLeft + mid) / 2 == mid ? mid + 1: (tempLeft + mid) / 2;
            }
        }
        if (tempIndex == -1) {
            return new int[]{-1,-1};
        }

        left = tempIndex;
        right = tempIndex;

        if (nums[0] == target) {
            left = 0;
        } else {
            tempLeft = 0;
            tempRight = tempIndex;
            while (!(nums[left] == target && nums[left - 1] != target)) {
                if (nums[left] != target) {
                    // move right
                    tempLeft = left;
                    left = ((right + tempLeft) / 2) + 1;
                } else {
                    // move left
                    tempRight = left;
                    left = (left+tempLeft) / 2;
                }
            }
        }

        if (nums[nums.length - 1] == target) {
            right = nums.length - 1;
        } else {
            tempLeft = tempIndex;
            tempRight = nums.length - 1;
            while (!(nums[right] == target && nums[right + 1] != target)) {
                if (nums[right] != target) {
                    // move left
                    tempRight = right;
                    right = ((right + tempLeft) / 2);
                } else {

                    // move right
                    tempLeft = right;
                    right = ((right + tempRight) / 2) + 1;

                }
            }
        }

        return new int[]{left, right};
    }
}
