package com.company;

import org.junit.Assert;
import org.junit.Test;

public class HappyLadyBugTest {

    public void Test(String expected, String input){
        //given

        //when
        String actual = HappyLadyBug.happyLadybugs(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test1(){
        Test("RBY_YBR", "YES");
    }

    @Test
    public void test2(){
        Test("X_Y__X", "NO");
    }

    @Test
    public void test3(){
        Test("__", "YES");
    }

    @Test
    public void test4(){
        Test("B_RRBR", "YES");
    }

    @Test
    public void test5(){
        Test("AABBC", "NO");
    }
    @Test
    public void test6(){
        Test("AABBC_C", "YES");
    }
    @Test
    public void test7(){
        Test("_", "YES");
    }
    @Test
    public void test8(){
        Test("DD__FQ_QQF", "YES");
    }

    @Test
    public void test9(){
        Test("AABCBC", "NO");
    }

}

