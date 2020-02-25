package com.company;

public class Max {
    public static int sequence(int[] arr) {

        int max = 0;

        int sum = 0;
        for(int i : arr){
            sum += i;
            if(sum<0){
                sum = 0;
            }
            max = Math.max(sum,max);
        }


        return max;
    }
}