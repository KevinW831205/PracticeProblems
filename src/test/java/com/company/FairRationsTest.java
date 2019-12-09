package com.company;

import org.junit.Assert;
import org.junit.Test;

public class FairRationsTest {
    public void test(int[] input, int expected){
        int actual = FairRations.fairRations(input);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test1(){
        int[] input = new int[]{2,3,4,5,6};
        test(input,4);
    }

    @Test
    public void test2(){
        int[] input = new int[]{1,2};
        test(input,-1);
    }

}
