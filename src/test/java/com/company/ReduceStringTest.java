package com.company;

import org.junit.Assert;
import org.junit.Test;

public class ReduceStringTest{


    public void reduceTest(String expected, String input){
        String actual = ReduceString.superReducedString(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test1(){
        reduceTest("abd","aaabccddd");
    }


    @Test
    public void test2(){
        reduceTest("","aa");
    }


    @Test
    public void test3(){
        reduceTest("baab","");
    }



}
