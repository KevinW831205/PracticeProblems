package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PickPeaksTest {

    public void peakTest(Map<String, List<Integer>> expected, int[] input) {
        Map<String, List<Integer>> actual = PickPeaks.getPeaks(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Map<String, List<Integer>> expected = new HashMap<>();
        expected.put("pos", Arrays.stream(new int[]{3, 7}).boxed().collect(Collectors.toList()));
        expected.put("peaks", Arrays.stream(new int[]{6, 3}).boxed().collect(Collectors.toList()));
        peakTest(expected, new int[]{1, 2, 3, 6, 4, 1, 2, 3, 2, 1});
    }

    @Test
    public void test2() {
        Map<String, List<Integer>> expected = new HashMap<>();
        expected.put("pos", Arrays.stream(new int[]{2}).boxed().collect(Collectors.toList()));
        expected.put("peaks", Arrays.stream(new int[]{3}).boxed().collect(Collectors.toList()));
        peakTest(expected, new int[]{2, 1, 3, 1, 2, 2, 2, 2});
    }

    @Test
    public void test3() {
        Map<String, List<Integer>> expected = new HashMap<>();
        expected.put("pos", Arrays.stream(new int[]{3, 5, 7, 11}).boxed().collect(Collectors.toList()));
        expected.put("peaks", Arrays.stream(new int[]{4, 4, 4, 2}).boxed().collect(Collectors.toList()));
        peakTest(expected, new int[]{1, 2, 3, 4, 3, 4, 3, 4, 3, 2, 1, 2, 1});
    }

    @Test
    public void test4() {
        Map<String, List<Integer>> expected = new HashMap<>();
        expected.put("pos", Arrays.stream(new int[]{3, 7, 10}).boxed().collect(Collectors.toList()));
        expected.put("peaks", Arrays.stream(new int[]{6, 3, 2}).boxed().collect(Collectors.toList()));
        peakTest(expected, new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1});
    }


}
