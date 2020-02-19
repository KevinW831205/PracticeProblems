package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardValidateTest {

    @Test
    public void test1(){
        boolean actual = CreditCardValidate.validate("891");
        Assert.assertEquals(false,actual);
    }
}
