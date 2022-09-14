package com.company;

public class FirstOccurenceString {

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {

            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}
