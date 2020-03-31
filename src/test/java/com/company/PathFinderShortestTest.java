package com.company;

import org.junit.Assert;
import org.junit.Test;

public class PathFinderShortestTest {


    public void finderTest(int expected, String input) {
        int actual = Finder.pathFinderShortest(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String maze =
                ".W.\n" +
                        ".W.\n" +
                        "...";

        finderTest(4, maze);
    }


    @Test
    public void test2() {
        String maze =
                ".W.\n" +
                        ".W.\n" +
                        "W..";

        finderTest(-1, maze);
    }

    @Test
    public void test3() {
        String maze = "......\n" +
                "......\n" +
                "......\n" +
                "......\n" +
                ".....W\n" +
                "....W.";

        finderTest(-1, maze);
    }

    @Test
    public void test4() {
        String maze = "......\n" +
                "......\n" +
                "......\n" +
                "......\n" +
                "......\n" +
                "......";
        finderTest(10, maze);
    }

}
