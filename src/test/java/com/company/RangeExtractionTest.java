package com.company;

import org.junit.Assert;
import org.junit.Test;

public class RangeExtractionTest {
    public void testExtaction(String expected, int[] input){
        String actual = RangeExtraction.rangeExtraction(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test1(){
        testExtaction("-6,-3-1,3-5,7-11,14,15,17-20", new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20});
    }


    @Test
    public void test2(){
        testExtaction("-3--1,2,10,15,16,18-20", new int[] {-3,-2,-1,2,10,15,16,18,19,20});
    }

    @Test
    public void test3(){
        testExtaction("-3--1,2,10,15,16,19,20", new int[] {-3,-2,-1,2,10,15,16,19,20});
    }



}
