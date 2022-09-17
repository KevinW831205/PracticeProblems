package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> s = new CombinationSum().combinationSum(new int[]{2, 3, 6,7}, 7);
        System.out.println(s);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>();

        for (int i = 0; i < candidates.length; i++) {
            int[] remainingCandidates = Arrays.stream(candidates)
                    .skip(i)
                    .toArray();

            List<Integer> nums = new ArrayList<Integer>();
            nums.add(candidates[i]);
            solve(nums, remainingCandidates, target, solution);
        }


        return solution;
    }

    private void solve(List<Integer> nums, int[] candidates, int target, List<List<Integer>> solution) {
        Integer currentSum = nums.stream().reduce(Integer::sum).orElse(0);
        if (currentSum == target) {
            solution.add(nums);
        } else if (currentSum < target) {
            for (int i = 0; i < candidates.length; i++) {
                int[] remainingCandidates = Arrays.stream(candidates)
                        .skip(i)
                        .toArray();
                List<Integer> copyNums = new ArrayList<Integer>(nums);
                copyNums.add(candidates[i]);
                solve(copyNums, remainingCandidates, target, solution);
            }
        }
    }
}
