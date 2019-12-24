package com.company;

import com.company.Problems12242019.SurfaceArea3D;
import org.junit.Assert;
import org.junit.Test;

public class SurfaceArea3DTest {

    public void test(int expected, int[][] input){
        int actual =  SurfaceArea3D.surfaceArea(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1(){
        int[][] input = new int[][]{new int[]{1,3,4}, new int[]{2,2,3}, new int[]{1,2,4}};
        test(60, input);
    }

}
