package com.company;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubStringTest {

    public void longestSubStringTest(int expected, String input){
        int actual = LongestSubString.lengthOfLongestSubstring(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        longestSubStringTest(3, "abcabcbb");
    }

    @Test
    public void test2(){
        longestSubStringTest(1, "bbbb");
    }

    @Test
    public void test3(){
        longestSubStringTest(3, "pwwkew");
    }

    @Test
    public void test4() {
        longestSubStringTest(1, " ");
    }

    @Test
    public void test5() {
        longestSubStringTest(2, "au");
    }

}
