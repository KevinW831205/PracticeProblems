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
            if(bArr[0].equals("_")){
                return "YES";
            } else {
                return "NO";
            }
        }

        boolean hasDuplicate = false;
        String currentCharacter = bArr[0];

        for (int i = 1; i < bArr.length-1; i++) {
            if(bArr[i].equals(currentCharacter)){
               hasDuplicate = true;
            } else {
                if(!hasDuplicate){
                    return "NO";
                }
                currentCharacter = bArr[i];
                hasDuplicate = false;
                continue;
            }
        }

        if(bArr[bArr.length-1].equals("_") || bArr[bArr.length-1].equals(bArr[bArr.length-2])){
            return "YES";
        }
        return "NO";
    }

}
