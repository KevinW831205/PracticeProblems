package com.company;

public class ReverseInteger {
    public static int reverse(int x) {
        String s = x + "";
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            s = s.substring(1);
            isNegative = true;
        }
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        try {
            return isNegative ? -1 * Integer.parseInt(reversed) : Integer.parseInt(reversed);
        } catch (Exception e) {
            return 0;
        }
    }
}
