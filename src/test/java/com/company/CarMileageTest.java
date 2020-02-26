package com.company;

import org.junit.Assert;
import org.junit.Test;

public class CarMileageTest {

    @Test
    public void testTooSmall() {
        Assert.assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostAwesome() {
        Assert.assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
    }

    @Test
    public void testAwesome() {
        Assert.assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
    }

    @Test
    public void testFarNotInteresting() {
        Assert.assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostInteresting() {
        Assert.assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
    }

    @Test
    public void testInteresting() {
        Assert.assertEquals(2, CarMileage.isInteresting(11211, new int[]{1337, 256}));
    }

}
