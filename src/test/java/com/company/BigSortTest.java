package com.company;

import org.junit.Assert;
import org.junit.Test;

public class BigSortTest {

    @Test
    public void bsTest() {
        String[] input = new String[]{
                "1",
                "2",
                "100",
                "12303479849857341718340192371",
                "3084193741082937",
                "3084193741082938",
                "111",
                "200"
        };
        String[] actual = BigSort.bigSorting(input);
        String[] expected=  new String[]{
                "1",
                "2",
                "100",
                "111",
                "200",
                "3084193741082937",
                "3084193741082938",
                "12303479849857341718340192371"
        };
        Assert.assertEquals(expected ,actual);
    }
}
