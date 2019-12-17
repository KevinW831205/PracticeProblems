package com.company;

import org.junit.Assert;
import org.junit.Test;

public class GridSearchTest {

    public void test(String expected, String[] gInput, String[] pInput) {
        String actual = GridSearch.gridSearch(gInput, pInput);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String[] gInput = new String[]{
                "1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222"};
        String[] pInput = new String[]{
                "876543",
                "111111",
                "111111"};

        test("YES",gInput,pInput);
    }

}
