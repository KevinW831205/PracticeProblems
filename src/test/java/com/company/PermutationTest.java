package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermutationTest {

    public void testFindPermutations(Set<Integer[]> expected, int input) {
        Set<Integer[]> actual = Permutation.findPermutations(input);

//        actual.forEach(is -> {
//            for (Integer i : is) {
//                System.out.print(i);
//            }
//            System.out.println();
//        });


        ArraySetTest<Integer> tester = new ArraySetTest<>(actual);

        expected.forEach(permutation -> {
            Assert.assertTrue(tester.contains(permutation));
        });
    }


    @Test
    public void test1() {
        Set<Integer[]> expected = new HashSet<>();

        Integer[] p = new Integer[]{0, 0};
        expected.add(p);
        p = new Integer[]{0, 1};
        expected.add(p);
        p = new Integer[]{1, 0};
        expected.add(p);
        p = new Integer[]{1, 1};
        expected.add(p);

        testFindPermutations(expected, 2);
    }

    @Test
    public void test2() {
        Set<Integer[]> expected = new HashSet<>();

        Integer[] p = new Integer[]{0, 0, 0};
        expected.add(p);
        p = new Integer[]{0, 0, 1};
        expected.add(p);
        p = new Integer[]{0, 1, 0};
        expected.add(p);
        p = new Integer[]{0, 1, 1};
        expected.add(p);
        p = new Integer[]{1, 0, 0};
        expected.add(p);
        p = new Integer[]{1, 0, 1};
        expected.add(p);
        p = new Integer[]{1, 1, 0};
        expected.add(p);
        p = new Integer[]{1, 1, 1};
        expected.add(p);

        testFindPermutations(expected, 3);
    }

}

class ArraySetTest<someType> {
    Set<someType[]> set;

    public ArraySetTest(Set<someType[]> set) {
        this.set = set;
    }

    public boolean contains(someType[] arr) {

        for (someType[] arr2 : set) {
            if (Arrays.equals(arr, arr2)){
                return true;
            }
        }
        return false;
    }

}

