package com.company;

import org.junit.Assert;
import org.junit.Test;

public class GreedTest {


    public void greedTest(int expected, int[] input){
        int actual = Greed.greedy(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test1(){
        int[] input = new int[]{5,1,3,4,1};
        greedTest(250,input);
    }

    @Test
    public void test2(){
        int[] input = new int[]{1,1,1,3,1};
        greedTest(1100,input);
    }

    @Test
    public void test3() {
        int[] input = new int[]{2, 4, 4, 5, 4};
        greedTest(450, input);
    }


}
