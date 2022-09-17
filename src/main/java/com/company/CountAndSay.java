package com.company;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n==1) {
            return "1";
        }
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char current = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                count++;
            } else {
                sb.append(count).append(current);
                current = s.charAt(i);
                count=1;
            }
            if (i == s.length() -1) {
                sb.append(count).append(current);
            }
        };
        return sb.toString();
    }
}
