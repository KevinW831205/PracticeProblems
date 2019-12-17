package com.company;

import org.junit.Assert;
import org.junit.Test;

public class StonesTest {


    public void test(int[] expected, int input1, int input2, int input3){
        int[] input = ManasaAndStones.stones(input1,input2,input3);
        Assert.assertArrayEquals(expected,input);
    }

    @Test
    public void test1(){
        int[] expected = new int[]{30,120,210,300};
        test(expected,4,10,100);
    }

    @Test
    public void test2(){
        int[] expected = new int[]{2,3,4};
        test(expected,3,1,2);
    }




}
