package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmaSuperComputer {

    static int twoPluses(String[] grid) {
        Integer pulse1 = 1;
        Integer pulse2 = 1;

        List<String[]> temp = new ArrayList<>();
        for(String s : grid){
            String[] row = s.split("");
            temp.add(row);
        }
        String[][] arrGrid = temp.toArray(new String[0][0]);


        return pulse1 * pulse2;
    }
}
