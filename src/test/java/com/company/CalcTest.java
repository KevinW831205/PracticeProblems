package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    public void evalTest(double expected, String input){
        Calc c = new Calc();

        double result = c.evaluate(input);

        Assert.assertEquals(expected,result);
    }

    @Test
    public void evalTest1(){
        evalTest(14,"5 1 2 + 4 * + 3 -");
    }

}
