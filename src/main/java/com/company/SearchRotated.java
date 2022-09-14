package com.company;

public class SearchRotated {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + right / 2;

        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }

        if (nums[left] == target) {
            return left;
        }

        if (nums[right] == target) {
            return right;
        }

        if (nums[mid] == target) {
            return mid;
        }

        while (right - left > 1) {


            if ((nums[left] < nums[mid] && (target > nums[left]) && (target < nums[mid])) || (nums[left] > nums[mid] && ((target > nums[left]) || target < nums[mid]))) {
                right = mid;
                mid = (left + mid) / 2;
            } else {
                left = mid;
                mid = (mid + right) /2;
            }

            if (nums[left] == target) {
                return left;
            }

            if (nums[right] == target) {
                return right;
            }

            if (nums[mid] == target) {
                return mid;
            }

        }

        return -1;
    }
}
