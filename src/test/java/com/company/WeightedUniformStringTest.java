package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeightedUniformStringTest {

    public void weightedUnifromTest(String[] expected, String s, int[] queries){

        String[] actual = WeightedUniformString.weightedUniformStrings(s,queries);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void test1(){
        weightedUnifromTest(new String[]{
                "Yes",
                "Yes",
                "Yes",
                "Yes",
                "No",
                "No",
        }, "abccddde",new int[]{1,3,12,5,9,10});
    }

    @Test
    public void test2(){
        weightedUnifromTest(new String[]{
                "Yes",
                "No",
                "Yes",
                "Yes",
                "No"
        },"aaabbbbcccddd",new int[]{9,7,8,12,5});
    }


}