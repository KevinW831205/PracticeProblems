package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(new Permutations().permute(new int[] {1,2,3}));

    }

    private List<List<Integer>> solution = new ArrayList<List<Integer>>();

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
}
