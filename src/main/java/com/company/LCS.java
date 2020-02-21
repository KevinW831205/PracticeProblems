package com.company;

public class LCS {

    public static String lcs(String x, String y) {
        // your code here

        StringBuilder result = new StringBuilder();

        int pointerJ = 0;

        System.out.println(x+ "  "+y);
        for (int i = 0; i < x.length(); i++) {
            for (int j = pointerJ; j < y.length(); j++) {
                if(x.charAt(i) == y.charAt(j)){
                    System.out.println("i"+x.charAt(i));
                    System.out.println("j"+y.charAt(j));
                    result.append(x.charAt(i));
                    pointerJ = j;
                    break;
                }
            }
        }

        return result.toString();
    }
}
