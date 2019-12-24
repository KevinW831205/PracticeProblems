package com.company;

import com.company.Problems12242019.StrangeCounter;
import org.junit.Assert;
import org.junit.Test;

public class StrangeCounterTest {

    public void Test(long expected,long t){

        long actual = StrangeCounter.strangeCounter(t);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test1(){
        Test(6,4);
    }

    @Test
    public void test2(){
        Test(4,6);
    }

    @Test
    public void test3(){
        Test(12,10);
    }

    @Test
    public void test4(){
        Test(3,1);
    }



}
