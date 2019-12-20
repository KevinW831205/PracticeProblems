package com.company;

import java.util.*;

public class HappyLadyBug {


//    static String happyLadybugs(String b) {
//        String[] bArr = b.split("");
//        if (b.contains("_")) {
//            b.replace("_","");
//            List<String> bList = new ArrayList<>(Arrays.asList(bArr));
//            bList.sort(Comparator.naturalOrder());
//            bArr = bList.toArray(new String[0]);
//        }
//
//        if(bArr.length == 1){
//            if(bArr[0].equals("_")){
//                return "YES";
//            } else {
//                return "NO";
//            }
//        }
//
//        boolean hasDuplicate = false;
//        String currentCharacter = bArr[0];
//
//        for (int i = 1; i < bArr.length-1; i++) {
//            System.out.println(i + bArr[i]);
//            if(bArr[i].equals(currentCharacter)){
//               hasDuplicate = true;
//            } else {
//                if(!hasDuplicate){
//                    return "NO";
//                }
//                currentCharacter = bArr[i];
//                hasDuplicate = false;
//                continue;
//            }
//        }
//
//        if(bArr[bArr.length-1].equals("_") || bArr[bArr.length-1].equals(bArr[bArr.length-2])){
//            return "YES";
//        }
//        return "NO";
//    }

    // SOMEONES SOLUTIONS
    static String happyLadybugs(String b) {
        int[] lb = new int['Z' - 'A' + 1];
        boolean esp = false;
        //The number of ladybirds for each color is saved in lb
        //and evaluated if there is at least one space
        for (char c : b.toCharArray()) {
            if(c!='_'){
                lb[c-'A']++;
            }else{
                esp = true;
            }
        }
        //If there are no spaces, all the ladybugs should have an equal partner
        if (!esp) {
            for (int i = 1; i < b.length()-1; i++) {
                if(b.charAt(i)!=b.charAt(i-1) && b.charAt(i)!=b.charAt(i+1)){
                    return "NO";
                }
            }
        }
        //If there are spaces, there can not be a ladybug of a single color
        for (int i : lb) {
            if(i==1) return "NO";
        }
        //If there is no unhappy ladybug
        return "YES";
    }

}
