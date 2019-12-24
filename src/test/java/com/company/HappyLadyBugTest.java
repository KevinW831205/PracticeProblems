package com.company;

import org.junit.Assert;
import org.junit.Test;

public class HappyLadyBugTest {

    public void Test(String expected, String input) {
        //given

        //when
        String actual = HappyLadyBug.happyLadybugs(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Test("YES", "RBY_YBR");
    }

    @Test
    public void test2() {
        Test("NO", "X_Y__X");
    }

    @Test
    public void test3() {
        Test("YES", "__");
    }

    @Test
    public void test4() {
        Test("YES", "B_RRBR");
    }

    @Test
    public void test5() {
        Test("NO", "AABBC");
    }

    @Test
    public void test6() {
        Test("YES", "AABBC_C");
    }

    @Test
    public void test7() {
        Test("YES", "_");
    }

    @Test
    public void test8() {
        Test("YES", "DD__FQ_QQF");
    }

    @Test
    public void test9() {
        Test("NO", "AABCBC");
    }

    @Test
<<<<<<< HEAD
    public void test10(){
        Test("NO","A");
=======
    public void test10() {
        Test("NO", "A__");
    }

    @Test
    public void test11() {
        Test("NO", "A_B_");
    }

    @Test
    public void test12() {
        Test("YES", "VAUGGGGBBYUAYTATY_ZXXZV");
>>>>>>> ad5fb554d05367161d48557f380eb2f1d23482f7
    }

}

