package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CamelCaseTest {


    public void ccTest(int expected, String input){
        int actual = CamelCase.camelcase(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test1(){
        ccTest(5,"saveChangesInTheEditor");
    }

}
