package com.company;


import java.util.Arrays;
import java.util.List;

public class NextSmaller {

    public static long nextSmaller(long n) {
        Long num = n;
        String[] digits = num.toString().split("");

        int indexToSwap = indexWhereBecomeSmaller(digits);
        String lh = num.toString().substring(0, indexToSwap );
        List<String> rhList = Arrays.asList(num.toString().substring(indexToSwap).split(""));
        rhList.sort(String::compareTo);
        Integer numToSwap1 = Integer.parseInt(digits[indexToSwap]);
        Integer numToSwap2 = null;

        for (String s : rhList) {
            if (Integer.parseInt(s) < numToSwap1) {
                numToSwap2 = Integer.parseInt(s);
                rhList.remove(s);
                break;
            }
        }
        if (numToSwap2 != null) {
            String rh = "";
            for (String s : rhList) {
                rh += s;
            }
            return Long.parseLong(lh + numToSwap2 + rh);
        }

        return -1;
    }

    public static int indexWhereBecomeSmaller(String[] digits) {
        Integer[] vDigits = Arrays.stream(digits).map(Integer::parseInt).toArray(Integer[]::new);
        for (int i = 0; i < vDigits.length - 1; i++) {
            if (vDigits[i] > vDigits[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
