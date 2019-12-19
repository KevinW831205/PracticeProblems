package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>();



        l1.add("a");
        l1.add("a");
        l1.add("b");
        l1.remove("a");

        System.out.println(l1);


    }
}
