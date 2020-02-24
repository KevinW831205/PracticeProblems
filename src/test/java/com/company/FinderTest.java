package com.company;

import org.junit.Assert;
import org.junit.Test;

public class FinderTest {

    public void finderTest(boolean expected, String input) {
        boolean actual = Finder.pathFinder(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String maze =
                         ".W.\n" +
                        ".W.\n" +
                        "...";

        finderTest(true, maze);
    }


    @Test
    public void test2() {
        String maze =
                        ".W.\n" +
                        ".W.\n" +
                        "W..";

        finderTest(false, maze);
    }

    @Test
    public void test3(){
        String maze = "......\n"+
                "......\n"+
                "......\n"+
                "......\n"+
                ".....W\n"+
                "....W.";

        finderTest(false,maze);
    }

}
