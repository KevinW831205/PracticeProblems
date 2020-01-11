package com.company;

public class Main {

    public static void main(String[] args) {

//        List<String> l1 = new ArrayList<String>();
//
//      639 000 000 000
//
//        l1.add("a");
//        l1.add("a");
//        l1.add("b");
//        l1.remove("a");
//
//        System.out.println(l1);

//        int x = Integer.MAX_VALUE;
//        System.out.println("x " +x);
//        System.out.println("x+1 "+(x+1));

        String s = "0123456789";
        System.out.println(s.substring(1));
        System.out.println(s.substring(0,5)+"."+s.substring(5+1));
        System.out.println(s.substring(4,7));
        System.out.println(s.substring(0,s.length()-1));
    }
}
