package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        //Go to town



        return 0;
    }

    private static boolean checkInteresting(int number, int[] awesomePhrases){
        Set<Integer> ap = new HashSet<>();
        Arrays.stream(awesomePhrases).forEach(ap::add);
        if(ap.contains(number)){
            return true;
        }
        Integer num = number;
        while(num>=10){
        }

    }



}
