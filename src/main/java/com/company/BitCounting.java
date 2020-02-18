package com.company;

public class BitCounting {

    public static int countBits(int n){
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        int result = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                result++;
            }
        }
        return result;
    }
}
