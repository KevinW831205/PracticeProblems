package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

//        List<String> l1 = new ArrayList<String>();
//
//      639 000 000 000
//
//        l1.add("a");
//        l1.add("a");
//        l1.add("b");
//        l1.remove("a");
//
//        System.out.println(l1);

//        int x = Integer.MAX_VALUE;
//        System.out.println("x " +x);
//        System.out.println("x+1 "+(x+1));
        Stack<Integer> stack = new Stack<>();
        

        String s = "0123456789";
        System.out.println(s.substring(1));
        System.out.println(s.substring(0,5)+"."+s.substring(5+1));
        System.out.println(s.substring(4,7));
        System.out.println(s.substring(0,s.length()-1));
    }

    public static Integer degreeOfArray(String input){

        String[] sArr = input.split(" ");
        Integer[] arr = new Integer[sArr.length];

        for(int i=0;i<sArr.length;i++){
            arr[i]=Integer.parseInt(sArr[i]);
        }
        Arrays.sort(arr);

        Integer maxCount = 0;
        Integer count = 0;
        Integer maxValue = null;
        for(int i =0 ;i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
                if(count> maxCount){
                    maxCount = count;
                    maxValue = arr[i];
                }
            } else {
                count = 0;
            }
        }
        return maxValue;
    }

}
