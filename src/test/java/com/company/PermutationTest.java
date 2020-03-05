package com.company;

import com.company.Problems12242019.Permutation;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PermutationTest {

    public void testFindPermutations(Set<Integer[]> expected, int input){
        Set<Integer[]> actual = Permutation.findPermutations(input);
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void test1(){
        Set<Integer[]> expected = new HashSet<>();

        Integer[] p = new Integer[]{0,0};
        expected.add(p);
        p = new Integer[]{0,1};
        expected.add(p);
        p = new Integer[]{1,0};
        expected.add(p);
        p = new Integer[]{1,1};
        expected.add(p);

        testFindPermutations(expected,2);
    }

}
