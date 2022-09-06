package com.company;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        String longest = "";

        if (s.length() == 0) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

//        if(s.length()==2) {
//            if(s.charAt(0)==s.charAt(1))
//                return s;
//            else
//                return s.substring(0,1);
//        }


        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1 + longest.length(); j <= s.length(); j++) {
                String currentSubString = s.substring(i, j);
                System.out.println(currentSubString + LongestPalindromicSubstring.isPalindrome(currentSubString));
                if (LongestPalindromicSubstring.isPalindrome(currentSubString)) {
                    if (currentSubString.length() > longest.length()) {
                        longest = currentSubString;
                    }
                }
            }
        }

        return longest;
    }

    private static boolean isPalindrome(String s) {
        int mid;
        int left;
        int right;
        if (s.length() == 1) {
            return true;
        }

        if (s.length() % 2 == 0) {
            mid = s.length() / 2;
            left = mid-1;
            right = mid;
        } else {
            mid = s.length() / 2;
            left = mid - 1;
            right = mid + 1;
        }


        while (left >= 0 && (right < s.length())) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
}
