package com.company;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

    public void testLPS(String expected, String input){
        String actual = LongestPalindromicSubstring.longestPalindrome(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        testLPS("bab", "babad");
    }

    @Test
    public void test2(){
        testLPS("bb","cbbd");
    }

    @Test
    public void test3() {
        testLPS("a", "a");
    }

    @Test
    public void test4() {
        testLPS("bb", "bb");
    }


    @Test
    public void test5() {
        testLPS("a", "ac");
    }


}
