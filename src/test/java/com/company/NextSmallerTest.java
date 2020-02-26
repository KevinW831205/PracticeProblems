package com.company;

import org.junit.Assert;
import org.junit.Test;

public class NextSmallerTest {

    public void nextsmTest(long expected, long input) {
        long actual = NextSmaller.nextSmaller(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        nextsmTest(12,21);
    }
    @Test
    public void test2(){
        nextsmTest(790,907);

    }
    @Test
    public void test3(){
        nextsmTest(513,531);
    }
    @Test
    public void test4(){
        nextsmTest(-1,1027);

    }
    @Test
    public void test5(){
        nextsmTest(414,441);

    }
    @Test
    public void test6(){
        nextsmTest(123456789,123456798);

    }
    @Test
    public void test7(){
        nextsmTest(1234455321,1234512345);

    }
    @Test
    public void test8(){
        nextsmTest(1223310,1230123);

    }
    @Test
    public void test9(){
        nextsmTest(10721,11027);

    }


}
