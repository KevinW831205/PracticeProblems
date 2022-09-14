package com.company;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
//        int[] nums = new int[] {4,3,2,1};
//        int[] nums = new int[] {1,2,3,4};
//        int[] nums = new int[] {1,3,2,4};
//        int[] nums = new int[] {1,1,5};
        int[] nums = new int[] {2,3,1};
        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }

    // 123 132 213 231 312 321
    // 1234 1243 1324 1342 1423 1432 2134 2143 2314 2341 2413 2431
    // 1,2,3    ->    1,3,2
    // 3,2,1    ->    1,2,3
    // 1,1,5    ->    1,5,1
    public static void nextPermutation(int[] nums) {

        int smallestFromRight = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                smallestFromRight = i;
                break;
            }
        }

        if (smallestFromRight >= 0) {
            for (int i = nums.length - 1; i > smallestFromRight; i--) {
                if (nums[smallestFromRight] < nums[i]) {
                    swap(nums, smallestFromRight, i);
                    break;
                }
            }

            reverse(nums, smallestFromRight + 1);

        } else {
            reverse(nums, 0);
        }

    }


    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
