package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HappyLadyBug {

    static String happyLadybugs(String b) {

        String[] bArr = b.split("");
        if (b.contains("_")) {
            List<String> bList = new ArrayList<>(Arrays.asList(bArr));
            bList.sort(Comparator.naturalOrder());
            bArr = bList.toArray(new String[0]);
        }

        if(bArr.length == 1){
            if(bArr[0] == "_"){
                return "NO";
            } else {
                return "YES";
            }
        }

        boolean hasDuplicate = false;
        String currentCharacter = bArr[0];
        for (int i = 0; i < bArr.length-1; i++) {
            if(bArr[i] != currentCharacter){

            } else{

            }
        }

        return null;
    }

}
