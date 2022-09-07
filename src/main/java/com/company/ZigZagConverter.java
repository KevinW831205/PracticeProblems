package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class ZigZagConverter {
    public static String convert(String s, int numRows) {

        /*
            N = 3
                r = 0 c 0 ,4, 8, 12
                r = 1 c 1, 3 ,5 ,7 ,9
                r = 2 c 2, 6 ,10

            N = 4
                r = 0 c 0, 6, 12
                r = 1 c 1, 5,7,
         */

        if (numRows == 1) return s;
        String ans = "";
        String[] rows = new String[numRows];
        Arrays.fill(rows, "");

        boolean dirRight = true;
        int curRow = 0;
        for (int i = 0; i<s.length(); i++) {
            rows[curRow] = rows[curRow] + s.charAt(i);
            if (curRow == 0) {
                dirRight = true;
            }
            if (curRow == numRows - 1) {
                dirRight =false;
            }
            if (dirRight) {
                curRow++;
            } else {
                curRow--;
            }
        }

        return Stream.of(rows).reduce((a, b) -> a + b).orElse("");
    }
}
