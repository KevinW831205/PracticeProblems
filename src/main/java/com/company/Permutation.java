package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static Set<Integer[]> findPermutations(int length) {
        int numOfPermutation = (int) Math.pow(2, length);

        Set<Integer[]> result = new HashSet<>();
        for (int i = 0; i < numOfPermutation; i++) {
            String p = String.format("%0" + length + "d", Integer.parseInt(Integer.toBinaryString(i)));
            Integer[] permutation = Arrays.stream(p.split(""))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
            result.add(permutation);
        }

        return result;
    }

}
