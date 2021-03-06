package com.company;

import org.junit.Assert;
import org.junit.Test;

public class BomberManTest {

    public void testBomberMan(String[] expected, int seconds, String[] grid) {
        String[] actual = BomberMan.bomberMan(seconds, grid);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        String[] expectedGrid = new String[]{
                "OOO.OOO",
                "OO...OO",
                "OOO...O",
                "..OO.OO",
                "...OOOO",
                "...OOOO"
        };
        String[] initialGrid = new String[]{
                ".......",
                "...O...",
                "....O..",
                ".......",
                "OO.....",
                "OO....."
        };
        testBomberMan(expectedGrid, 3, initialGrid);
    }

    @Test
    public void test2() {
        String[] expectedGrid = new String[]{
                ".......",
                "...O.O.",
                "...OO..",
                "..OOOO.",
                "OOOOOOO",
                "OOOOOOO"
        };
        String[] initialGrid = new String[]{
                ".......",
                "...O.O.",
                "....O..",
                "..O....",
                "OO...OO",
                "OO.O..."
        };
        testBomberMan(expectedGrid, 5, initialGrid);
    }

    @Test
    public void test3(){
        String[] expectedGrid = new String[]{
                "OOOOOOO",
                "OOOOOOO",
                "OOOOOOO",
                "OOOOOOO",
                "OOOOOOO",
                "OOOOOOO"
        };
        String[] initialGrid = new String[]{
                ".......",
                "...O.O.",
                "....O..",
                "..O....",
                "OO...OO",
                "OO.O..."
        };
        testBomberMan(expectedGrid, 4, initialGrid);
    }
}
