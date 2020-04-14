package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeightedUniformString {
    public static void main(String[] args) {
        weightedUniformStrings("abccddde",new int[]{1,3,12,5,9,10});
    }

    static String[] weightedUniformStrings(String s, int[] queries) {
        Set<Integer> sums = new HashSet<>();
        List<String> result = new ArrayList<>();

        int checkingIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(checkingIndex)){
                sums.add(sumChars(s.substring(checkingIndex,i+1)));
            } else{
                checkingIndex = i;
                sums.add(sumChars(s.substring(checkingIndex,i+1)));
            }
        }
        for(int query : queries){
            if(sums.contains(query)){
                result.add("Yes");
            } else {
                result.add("No");
            }
        }
        return result.toArray(new String[]{});
    }

    private static Integer sumChars(String s){
        return (s.codePointAt(0)-96)*s.length();
    }
}
