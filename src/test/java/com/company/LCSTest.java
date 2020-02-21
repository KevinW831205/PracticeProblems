package com.company;

import org.junit.Assert;
import org.junit.Test;

public class LCSTest {


    public void testLCS(String expected, String input1, String input2){
        String actual = LCS.lcs(input1, input2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        testLCS("","a","b");
    }

    @Test
    public void test2(){
        testLCS("abc","abcdef","abcdef");
    }

    @Test
    public void test3(){
        testLCS( "12356","132535365", "123456789");
    }

}
