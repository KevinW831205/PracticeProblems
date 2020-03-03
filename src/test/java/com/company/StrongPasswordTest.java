package com.company;

import org.junit.Assert;
import org.junit.Test;

public class StrongPasswordTest {

    public void passTest(int expected,String input){
        int actual = StrongPassword.minimumNumber(input.length(), input);
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void test1(){
        passTest(3, "Ab1");
    }

    @Test
    public void test2(){
        passTest(1, "#Asdfqer");
    }


    @Test
    public void testSpecial(){
        passTest(0, "Asdf123-");
    }




}
