package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BigSort {

    static String[] bigSorting(String[] unsorted) {

        return Arrays.stream(unsorted).sorted((s1, s2) -> {
            if(s1.length() == s2.length()){
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        })
        .toArray(String[]::new);

    }

}
