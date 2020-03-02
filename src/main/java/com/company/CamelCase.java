package com.company;

import java.util.Arrays;

public class CamelCase {

    static int camelcase(String s) {
        return (int) (Arrays.stream(s.split(""))
                        .filter(c->c.matches("[A-Z]"))
                        .count() + 1);

    }
}
