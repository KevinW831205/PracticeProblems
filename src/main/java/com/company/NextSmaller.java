package com.company;


import java.util.Arrays;

public class NextSmaller {

    public static long nextSmaller(long n) {
        Long num = n;
        String[] digits = num.toString().split("");

        int indexToSwap = indexWhereBecomeSmaller(digits);
        String lh = num.toString().substring(0, indexToSwap);
        System.out.println("index to swap: " + indexToSwap);
        System.out.println("lh: " + lh);
//        List<String> rhList = Arrays.asList(num.toString().substring(indexToSwap).split(""));
//        rhList.sort(String::compareTo);
        String[] rhArr = num.toString().substring(indexToSwap).split("");
        int greatestSmallerIndex = 1;
        Integer greatestSmallerValue = Integer.parseInt(rhArr[1]);
        for (int i = 2; i < rhArr.length; i++) {
            if (Integer.parseInt(rhArr[i]) < Integer.parseInt(rhArr[0]) && Integer.parseInt(rhArr[i]) > greatestSmallerValue) {
                greatestSmallerIndex = i;
                greatestSmallerValue = Integer.parseInt(rhArr[i]);
            }
        }
        Swap(rhArr, 0, greatestSmallerIndex);
        Arrays.sort(rhArr, 1, rhArr.length - 1);
        String result = lh.toString();
        for(String s : rhArr){
            result += s;
        }
        return Long.parseLong(result);



//        if (numToSwap2 != null) {
//            String rh = "";
//            for (String s : rhList) {
//                rh += s;
//            }
//            return Long.parseLong(lh + numToSwap2 + rh);
//        }

//        return -1;
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

    public static void Swap(String[] arr, int i1, int i2) {
        String temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }


}
