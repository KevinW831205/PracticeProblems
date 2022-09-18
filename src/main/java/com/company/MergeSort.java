package com.company;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] res =MergeSort.sort(new int[]{99,44,6,2,1,5,63,87,283,4,0});
        System.out.println(Arrays.toString(res));
    }

    public static int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int[] left = Arrays.copyOfRange(arr,0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr,arr.length / 2, arr.length);

        return merge(sort(left), sort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] arranged= new int[left.length + right.length];
        int i = 0, j = 0;
        System.out.println("Left "+ Arrays.toString(left) + " Right "+ Arrays.toString(right));
        while (i < left.length || j < right.length) {
            if (i==left.length) {
                arranged[i+j]=right[j];
                j++;
                continue;
            }
            if (j==right.length) {
                arranged[i+j]=left[i];
                i++;
                continue;
            }
            if (left[i] <= right[j]) {
                arranged[i + j] = left[i];
                i++;
            } else {
                arranged[i + j] = right[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(arranged));
        return arranged;
    }
}
