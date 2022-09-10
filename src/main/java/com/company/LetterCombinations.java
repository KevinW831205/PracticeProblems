package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinations {
    public static void main(String[] args) {
        LetterCombinations.letterCombinations("234");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0) {
            return result;
        }
        Map<String, String[]> numMap = new HashMap<>();
        numMap.put("2", new String[]{"a", "b", "c"});
        numMap.put("3", new String[]{"d", "e", "f"});
        numMap.put("4", new String[]{"g", "h", "i"});
        numMap.put("5", new String[]{"j", "k", "l"});
        numMap.put("6", new String[]{"m", "n", "o"});
        numMap.put("7", new String[]{"p", "q", "r", "s"});
        numMap.put("8", new String[]{"t", "u", "v"});
        numMap.put("9", new String[]{"w", "x", "y", "z"});

        String[] digitArr = digits.split("");


        String[][] possibleKeysPerDigit = Arrays.stream(digitArr)
                .map(numMap::get).toArray(String[][] :: new);

        result = Arrays.asList(possibleKeysPerDigit[0]);

        for (int i = 1; i < possibleKeysPerDigit.length; i++) {
            String[] nextLetters = possibleKeysPerDigit[i];
            result = result.stream()
                    .map(combination -> Arrays.stream(nextLetters).map(letter -> combination + letter).collect(Collectors.toList()))
                    .flatMap(perm -> perm.stream())
                    .collect(Collectors.toList());
        }

        System.out.println(result);

        return result;
    }

}
