package com.company;

public class LCS {

    public static String lcs(String x, String y) {
        // your code here


        String resultR = findCommon(x.toCharArray(),y.toCharArray(),x.length(),y.length());
        StringBuilder result = new StringBuilder(resultR);
        return result.reverse().toString();
    }

    private static String findCommon(char[] x, char[] y, int m, int n) {
        if (m == 0 || n == 0) {
            return "";
        } else if (x[m - 1] == y[n - 1]) {
            return x[m - 1] + findCommon(x, y, m - 1, n - 1);
        } else {
            String a = findCommon(x, y, m, n - 1);
            String b = findCommon(x, y, m - 1, n);
            return (a.length() > b.length()) ? a : b;
        }

    }
}
