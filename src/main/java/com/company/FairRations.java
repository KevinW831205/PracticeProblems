package com.company;

public class FairRations {


    static int fairRations(int[] B) {

        int counter = 0;
        for(int i=0; i<B.length-1; i++){
            if(B[i]%2 == 1){
                B[i]++;
                B[i+1]++;
                counter+=2;
            }
        }

        if(B[B.length-1]%2 == 0){
            return counter;
        } else {
            System.out.println("NO");
            return -1;
        }

    }


}
