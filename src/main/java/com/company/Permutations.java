package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {
    public static void main(String[] args) {
//        System.out.println(new Permutations().permute(new int[] {1,2,3}));
        System.out.println(new Permutations().permuteUnique(new int[]{1,1,1,2,2,2}));
    }

    private List<List<Integer>> solution = new ArrayList<List<Integer>>();
    private List<List<Integer>> solutionUnique = new ArrayList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        backTrack(numList, current);
        return solution;
    }

    private void backTrack(List<Integer> remainingNums, List<Integer> current) {
        if (remainingNums.size() == 0) {
            solution.add(current);
        }
        for (int i = 0; i < remainingNums.size(); i++) {
            List<Integer> newRemaining = new ArrayList<>(remainingNums);
            List<Integer> copyCurrent = new ArrayList<>(current);
            copyCurrent.add(newRemaining.remove(i));
            backTrack(newRemaining, copyCurrent);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        backTrackUnique(numList, current);
        return solutionUnique;

    }

    private void backTrackUnique(List<Integer> remainingNums, List<Integer> current) {
        if (remainingNums.size() == 0){
            solutionUnique.add(current);
        }
        Integer lastChecked = null;
        for (int i = 0; i < remainingNums.size(); i++) {
            if (lastChecked != null && lastChecked.equals(remainingNums.get(i))) {
                continue;
            } else {
                lastChecked = remainingNums.get(i);
                List<Integer> newRemaining = new ArrayList<>(remainingNums);
                List<Integer> copyCurrent = new ArrayList<>(current);
                copyCurrent.add(newRemaining.remove(i));
                backTrackUnique(newRemaining, copyCurrent);
            }
        }
    }
}
