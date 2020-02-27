package com.company;


import java.util.Arrays;

public class NextSmaller {

    public static long nextSmaller(long n) {

        int i;

        Integer[] arr = Arrays.stream(((Long) n).toString().split("")).map(Integer::parseInt).toArray(Integer[]::new);

        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                break;
            }
        }


        if (i == 0) {
            return -1;
        }
        else{
            int x = arr[i - 1], min = i;

            // II) Find the smallest digit on right
            // side of (i-1)'th digit that is greater
            // than number[i-1]
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] > x && arr[j] < arr[min])
                {
                    min = j;
                }
            }

            // III) Swap the above found smallest
            // digit with number[i-1]
            Swap(arr, i - 1, min);

            // IV) Sort the digits after (i-1)
            // in ascending order
            Arrays.sort(arr, i, arr.length);
        }

        StringBuilder res = new StringBuilder();
        Arrays.stream(arr).map(Object::toString).forEach(res::append);
        return Long.parseLong(res.toString());


//        Long num = n;
//        String[] digits = num.toString().split("");
//
//        int indexToSwap = indexWhereBecomeSmaller(digits);
//        if(indexToSwap <0){
//            return -1L;
//        }
//
//        String lh = num.toString().substring(0, indexToSwap);
//        System.out.println("index to swap: " + indexToSwap);
//        System.out.println("lh: " + lh);
////        List<String> rhList = Arrays.asList(num.toString().substring(indexToSwap).split(""));
////        rhList.sort(String::compareTo);
//        String[] rhArr = num.toString().substring(indexToSwap).split("");
//        printArr(rhArr);
//        int greatestSmallerIndex = 1;
//
//        Integer greatestSmallerValue = Integer.parseInt(rhArr[1]);
//        for (int i = 2; i < rhArr.length; i++) {
//            if (Integer.parseInt(rhArr[i]) < Integer.parseInt(rhArr[0]) && Integer.parseInt(rhArr[i]) > greatestSmallerValue) {
//                greatestSmallerIndex = i;
//                greatestSmallerValue = Integer.parseInt(rhArr[i]);
//            }
//        }
//        Swap(rhArr, 0, greatestSmallerIndex);
//        System.out.println("B4 sort");
//        printArr(rhArr);
//
//        Arrays.sort(rhArr, 1, rhArr.length - 1, Comparator.reverseOrder());
//        System.out.println("Sorted");
//        printArr(rhArr);
//
//        String result = lh;
//        for(String s : rhArr){
//            result += s;
//        }
//        return Long.parseLong(result);
//


//        if (numToSwap2 != null) {
//            String rh = "";
//            for (String s : rhList) {
//                rh += s;
//            }
//            return Long.parseLong(lh + numToSwap2 + rh);
//        }

//        return -1;
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

    public static void Swap(Integer[] arr, int i1, int i2) {
        Integer temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }


}
