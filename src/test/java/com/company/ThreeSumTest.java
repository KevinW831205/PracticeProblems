package com.company;

import com.company.Problems12242019.SurfaceArea3D;
import org.junit.Assert;
import org.junit.Test;

public class ThreeSumTest {


    public void threeSumClosest(int expected, int[] nums, int target){
        int actual =  ThreeSum.threeSumClosest(nums, target);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        threeSumClosest(2, new int[] {-1,2,1,-4}, 1);
    }

    @Test
    public void test2() {
        threeSumClosest(0, new int[]{0,0,0}, 1);
    }

    @Test
    public void test3() {
        threeSumClosest(-2, new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5}, -2);
    }
}
