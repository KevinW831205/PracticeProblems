package com.company;

import com.sun.scenario.effect.Offset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmaSuperComputer {

    static int twoPluses(String[] grid) {
        Integer pulse1 = 1;
        Integer pulse2 = 1;

        List<String[]> temp = new ArrayList<>();
        for (String s : grid) {
            String[] row = s.split("");
            temp.add(row);
        }
        String[][] arrGrid = temp.toArray(new String[0][0]);

        //i is row j is col
        for (int i = 1; i < arrGrid.length; i++) {
            for (int j = 1; j < arrGrid[i].length; j++) {
                int offset = 1;
                if (arrGrid[i + offset][j].equals("G") && arrGrid[i - offset][j].equals("G") && arrGrid[i][j + offset].equals("G") && arrGrid[i][j - offset].equals("G")) {

                }
            }
        }

        return pulse1 * pulse2;
    }
}
