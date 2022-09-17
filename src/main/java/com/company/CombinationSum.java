package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> s = new CombinationSum().combinationSum2(new int[]{10,1,2,6,7,1,5}, 8);
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


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);

        for (int i = 0; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i-1]) {
                continue;
            }
            int[] remainingCandidates = Arrays.stream(candidates)
                    .skip(i + 1)
                    .toArray();

            List<Integer> nums = new ArrayList<Integer>();
            nums.add(candidates[i]);
            solve2(remainingCandidates, target - candidates[i], nums, solution);
        }


        return solution;
    }

    private void solve2(int[] candidates, int remain, List<Integer> tempList, List<List<Integer>> solution) {
        if (remain == 0) {
            System.out.println("found list "+ tempList);
            solution.add(tempList);
        } else if (remain > 0) {
            for (int i = 0; i < candidates.length; i++) {
                if (i > 0 && candidates[i] == candidates[i-1]) {
                    continue;
                }
                int[] remainingCandidates = Arrays.stream(candidates)
                        .skip(i + 1)
                        .toArray();

                List<Integer> nums = new ArrayList<Integer>(tempList);
                nums.add(candidates[i]);
                solve2(remainingCandidates, remain - candidates[i], nums, solution);
            }
        }
    }
}
