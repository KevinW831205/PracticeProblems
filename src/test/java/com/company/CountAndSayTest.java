package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {
    public void CountAndSayTest(String expected, int input) {
        String actual = CountAndSay.countAndSay(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        CountAndSayTest("1", 1);
    }

    @Test
    public void test2() {
        CountAndSayTest("11", 2);
    }

    @Test
    public void test3() {
        CountAndSayTest("21", 3);
    }

    @Test
    public void test4() {
        CountAndSayTest("1211", 4);
    }
}
