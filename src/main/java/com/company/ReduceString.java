package com.company;

public class ReduceString {

    static String superReducedString(String s) {

        String[] arr = s.split("");
        String result;
        boolean changed;
        do {
            result = "";
            changed = false;
            for (int i = 0; i < arr.length; i++) {
                if(i == arr.length-1){
                    result += arr[i];
                    break;
                }
                if (arr[i].equals(arr[i + 1])) {
                    i++;
                    changed = true;
                } else {
                    result+=arr[i];
                }
            }
            s = result;
            arr = s.split("");
        }while(changed);

        return result;
    }
}
