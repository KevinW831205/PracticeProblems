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
        Long[] rh = Arrays.copyOfRange(digits, indexFirstLarger, digits.length - 1);

        Long valueToSwap = rh[0];
        Long checkValue = rh[1];
        int indexToSwap = 1;
        for(int i=2; i<rh.length; i++){
            if(rh[i]<valueToSwap && rh[i]>checkValue){
                checkValue = rh[i];
                indexToSwap = i;
            }
        }
        swap(rh,0,indexToSwap);


        System.out.println(indexFirstLarger);

        return -1L;
    }

//    public static int indexWhereBecomeSmaller(String[] digits) {
//        Integer[] vDigits = Arrays.stream(digits).map(Integer::parseInt).toArray(Integer[]::new);
//        int result = -1;
//        for (int i = 0; i < vDigits.length - 1; i++) {
//            if (vDigits[i] > vDigits[i + 1]) {
//                if(i==0 && vDigits[i+1] == 0){
//                    continue;
//                }
//                result = i;
//            }
//        }
//        return result;
//    }

    public static void swap(Long[] arr, int i1, int i2) {
        Long temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }


}
