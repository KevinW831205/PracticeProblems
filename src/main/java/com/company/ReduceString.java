package com.company;

public class ReduceString {

    static String superReducedString(String s) {

        String[] arr = s.split("");
        String result;
        boolean changed = false;
        do {
            result = "";
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].equals(arr[i + 1])) {
                    i++;
                    changed = false;
                } else {
                    result+=arr[i];
                }
            }
            s = result;
            System.out.println(s);
            arr = s.split("");
        }while(changed);
        return result;
    }
}
