package com.company;

import java.util.Collections;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        int m = num / 1000;
        num %= 1000;
        sb.append(String.join("", Collections.nCopies(m, "M")));

        int cm = num / 900;
        num %= 900;
        sb.append(String.join("", Collections.nCopies(cm, "CM")));


        int d = num / 500;
        num %= 500;
        sb.append(String.join("", Collections.nCopies(d, "D")));

        int cd = num / 400;
        num %= 400;
        sb.append(String.join("", Collections.nCopies(cd, "CD")));

        int c = num / 100;
        num %= 100;
        sb.append(String.join("", Collections.nCopies(c, "C")));


        int xc = num / 90;
        num %= 90;
        sb.append(String.join("", Collections.nCopies(xc, "XC")));

        int l = num / 50;
        num %= 50;
        sb.append(String.join("", Collections.nCopies(l, "L")));

        int xl = num / 40;
        num %= 40;
        sb.append(String.join("", Collections.nCopies(xl, "XL")));

        int x = num / 10;
        num %= 10;
        sb.append(String.join("", Collections.nCopies(x, "X")));

        int ix = num / 9;
        num %= 9;
        sb.append(String.join("", Collections.nCopies(ix, "IX")));

        int v = num /5;
        num %= 5;
        sb.append(String.join("", Collections.nCopies(v, "V")));

        int iv = num / 4;
        num %= 4;
        sb.append(String.join("", Collections.nCopies(iv, "IV")));


        int i = num;
        sb.append(String.join("", Collections.nCopies(i, "I")));


        return sb.toString();
    }
}
