package com.company;

import org.junit.Assert;
import org.junit.Test;

public class AbsolutePermutationTest {

    public void absolutePermutationTest(int[] expected, int n, int k){
        int[] actual =  AbsolutePermutation.absolutePermutation(n,k);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void Test1(){
        int[] expected = new int[]{2,1};
        absolutePermutationTest(expected,2,1);
    }

    @Test
    public void Test2(){
        int[] expected = new int[]{1,2,3};
        absolutePermutationTest(expected,3,0);

    }

    @Test
    public void Test3(){
        int[] expected = new int[]{-1};
        absolutePermutationTest(expected,3,2);
    }

    @Test
    public void Test4(){
        int[] expected = new int[]{6,7,8,9,10,1,2,3,4,5};
        absolutePermutationTest(expected,10,5);
    }

    @Test
    public void Test5(){
        int[] expected = new int[]{3,4,1,2,7,8,5,6,11,12,9,10};
        absolutePermutationTest(expected,12,2);
    }

    @Test
    public void Test6(){
        int[] expected = new int[]{3,4,1,2,7,8,5,6,11,12,9,10};
        absolutePermutationTest(expected,12,2);
    }

}