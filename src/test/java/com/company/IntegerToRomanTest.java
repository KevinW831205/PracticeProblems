package com.company;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {

    public void intToRomanTest(String expected, int input) {
        String actual = IntegerToRoman.intToRoman(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        intToRomanTest("III", 3);
    }

    @Test
    public void test2() {
        intToRomanTest("LVIII", 58);
    }

    @Test
    public void test3() {
        intToRomanTest("IV", 4);
    }

    @Test
    public void test4() {
        intToRomanTest("MCMXCIV", 1994);
    }
}
