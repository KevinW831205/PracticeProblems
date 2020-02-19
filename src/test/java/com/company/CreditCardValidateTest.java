package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardValidateTest {

    @Test
    public void test1(){
        boolean actual = CreditCardValidate.validate("891");
        Assert.assertEquals(false,actual);
    }
    @Test
    public void test2(){
        boolean actual = CreditCardValidate.validate("232");
        Assert.assertEquals(true,actual);
    }
}
