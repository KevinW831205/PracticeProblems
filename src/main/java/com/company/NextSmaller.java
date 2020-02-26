package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextSmaller {

    public static long nextSmaller(long n) {
        Long num = n;
        String[] digits = num.toString().split("");


        int i = indexWhereBecomeSmaller(digits);
        String numToFindSmaller = digits[i];
        String fh = num.toString().substring(0, i - 1);
        String[] lha = num.toString().substring(i).split("");
        List<String> lhaSorted = Arrays.stream(lha)
                .sorted((s1, s2) -> -1 * s1.compareTo(s2))
                .collect(Collectors.toList());

        String toSwap = null;
        for (String s : lhaSorted) {
            if (s.compareTo(numToFindSmaller) < 0) {
                toSwap = s;
                lhaSorted.remove(s);
                break;
            }
        }
        if (toSwap != null) {
            return Long.parseLong(fh + toSwap + lhaSorted.toString());
        }
        return -1;
    }

    public static int indexWhereBecomeSmaller(String[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].compareTo(s[i + 1]) < 0) {
                if (i == 0 && s[i + 1].equals("0")) {
                    continue;
                }
                return i;
            }
        }
        return -1;
    }
}
