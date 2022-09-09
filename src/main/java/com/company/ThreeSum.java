package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum.threeSum(new int[] {-1,0,1,2,-1,-4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // -4 -1 -1 0 1 2
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i <nums.length - 2; i++) {
            Integer n1 = nums[i];
            int leftP = i + 1;
            int rightP = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            System.out.println(n1);

            while (leftP < rightP) {
                Integer n2 = nums[leftP];
                Integer n3 = nums[rightP];
                Integer sum = n1 + n2 + n3;

                if (sum == 0) {
                    List<Integer> tuple = new ArrayList<Integer>();
                    tuple.add(n1);
                    tuple.add(n2);
                    tuple.add(n3);
                    list.add(tuple);
                    do {
                        leftP++;
                    } while (nums[leftP] == n2 && leftP < rightP);
                } else if (sum > 0) {
                    rightP--;
                } else if (sum < 0) {
                    leftP++;
                }
            }
        }

        return list;
    }
}
