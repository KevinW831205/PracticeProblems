package com.company;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {

        int largest = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> charsSeen = new HashSet<>();
            int currentCount = 0;
            for (int j = i; j < s.length(); j++) {

                Character current = s.charAt(j);
                boolean seen = charsSeen.contains(current);
                if (!seen) {
                    charsSeen.add(current);
                    currentCount++;
                    largest = Math.max(largest, currentCount);
                }

                if (seen) {
                    break;
                }
            }
        }
        return largest;
    }
}
