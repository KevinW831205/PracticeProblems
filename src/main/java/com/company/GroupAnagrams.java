package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        new GroupAnagrams().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        List<String[]> ordered = new ArrayList<>();
        for (String str : strs) {
            String[] splitted = str.split("");
            Arrays.sort(splitted);
            String sorted = String.join("", splitted);
            ordered.add(new String[]{sorted, str});
        }
        ordered.sort(Comparator.comparing(a -> a[0]));

        String last = null;
        List<String> group = new ArrayList<>();
        for (String[] pair : ordered) {
            if (last == null) {
                last = pair[0];
            }
            if (last.equals(pair[0])) {
                group.add(pair[1]);
            } else {
                ans.add(group);
                last = pair[0];
                group = new ArrayList<>();
                group.add(pair[1]);
            }

        }
        ans.add(group);
        return ans;
    }
}
