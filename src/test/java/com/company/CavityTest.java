package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CavityTest {

    public void test(String[] input, String[] expected){
        String[] actual = Cavity.cavityMap(input);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test1() {
        String[] input = new String[]{"989", "191", "111"};
        String[] expected = new String[]{"989","1X1","111"};
        test(input, expected);
    }

    @Test
    public void test2() {
        String[] input = new String[]{"1112", "1912", "1892","1234"};
        String[] expected = new String[]{"1112","1X12","18X2","1234"};
        test(input, expected);
    }

    @Test
    public void test3(){
        String[] input = new String[]{"1111", "1991", "1991","1111"};
        String[] expected = new String[]{"1111","1991","1991","1111"};
        test(input, expected);
    }


}
