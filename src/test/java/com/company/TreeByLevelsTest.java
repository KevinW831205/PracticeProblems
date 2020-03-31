package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeByLevelsTest {


    public void levelTest(List<Integer> expected, Node tree) {

        List<Integer> actual = TreeByLevels.treeByLevels(tree);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test1() {
        Node tree = new Node(new Node(new Node(null, null, 1), new Node(null, null, 3), 8), new Node(new Node(null, null, 4), new Node(null, null, 5), 9), 2);
        List<Integer> expected = new ArrayList<>();
        int[] e = new int[]{2, 8, 9, 1, 3, 4, 5};
        expected.add(2);
        expected.add(8);
        expected.add(9);
        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        levelTest(expected,tree);
    }

}
