package com.company;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConverterTest {

    public void ZigZagConverterTest(String expected, String s, int rows){

        String actual = ZigZagConverter.convert(s,rows);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test1() {
        ZigZagConverterTest("PAHNAPLSIIGYIR", "PAYPALISHIRING", 3);
    }
    @Test
    public void test2() {
        ZigZagConverterTest("PINALSIGYAHRPI", "PAYPALISHIRING", 4);
    }
    @Test
    public void test3() {
        ZigZagConverterTest("A", "A", 1);
    }

    @Test
    public void test4() {
        ZigZagConverterTest("AB", "AB", 1);
    }
}
