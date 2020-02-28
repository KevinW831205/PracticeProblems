package com.company;


import java.util.Arrays;

public class NextSmaller {

    public static long nextSmaller(long n) {

        Long[] digits = Arrays.stream(((Long) n).toString().split("")).map(Long::parseLong).toArray(Long[]::new);

        int indexFirstLarger = -1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i - 1] > digits[i]) {

                indexFirstLarger = i - 1;
                break;
            }
        }
        if (indexFirstLarger == -1) {
            return -1L;
        }
        Long[] lh = Arrays.copyOfRange(digits, 0, indexFirstLarger);
        Long[] rh = Arrays.copyOfRange(digits, indexFirstLarger, digits.length);

        Long valueToSwap = rh[0];
        Long checkValue = rh[1];
        int indexToSwap = 1;
        for (int i = 2; i < rh.length; i++) {
            if (rh[i] < valueToSwap && rh[i] > checkValue) {
                checkValue = rh[i];
                indexToSwap = i;
            }
        }
        swap(rh, 0, indexToSwap);
        Arrays.sort(rh, 1, rh.length, (s1, s2) -> s2.compareTo(s1));

        StringBuilder sb = new StringBuilder();
        for (Long i : lh) {
            sb.append(i);
        }
        for (Long i : rh) {
            sb.append(i);
        }

        String resultString = sb.toString();
        if(resultString.charAt(0) == '0'){
            return -1L;
        }
        return Long.parseLong(resultString);

    }

    public static void swap(Long[] arr, int i1, int i2) {
        Long temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }


}
