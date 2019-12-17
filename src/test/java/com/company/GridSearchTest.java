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

    @Test
    public void test2(){
        String[] gInput = new String[]{
                "400453592126560" ,
                "114213133098692" ,
                "474386082879648" ,
                "522356951189169" ,
                "887109450487496" ,
                "252802633388782" ,
                "502771484966748" ,
                "075975207693780" ,
                "511799789562806" ,
                "404007454272504" ,
                "549043809916080" ,
                "962410809534811" ,
                "445893523733475" ,
                "768705303214174" ,
                "650629270887160"
        };

        String[] pInput = new String[]{
                "99",
                "99"
        };

        test("NO",gInput,pInput);
    }

}
