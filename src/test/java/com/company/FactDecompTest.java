package com.company;

import org.junit.Assert;
import org.junit.Test;

public class FactDecompTest {

//    @Test
//    public void pfTest() {
//        SortedMap<Integer, Integer> actual = FactDecomp.primeFactors(6);
//        SortedMap<Integer, Integer> expected = new TreeMap<>();
//        expected.put(2, 1);
//        expected.put(3, 1);
//        Assert.assertEquals(expected, actual);
//    }

    public void factDecomp(String expected, int input) {
        String actual = FactDecomp.decomp(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        factDecomp("2^15 * 3^6 * 5^3 * 7^2 * 11 * 13 * 17", 17);
    }

    @Test
    public void test2() {
        factDecomp("2^19 * 3^9 * 5^4 * 7^3 * 11^2 * 13 * 17 * 19", 22);
    }

    @Test
    public void test3() {
        factDecomp("2^3 * 3 * 5", 5);
    }

    @Test
    public void test4() {
        factDecomp("2^11 * 3^5 * 5^2 * 7^2 * 11 * 13", 14);
    }

    @Test
    public void test5() {
        factDecomp("2^22 * 3^10 * 5^6 * 7^3 * 11^2 * 13 * 17 * 19 * 23", 25);
    }

    @Test
    public void test6() {
        factDecomp("2^7 * 3^4 * 5 * 7", 9);
    }






}
