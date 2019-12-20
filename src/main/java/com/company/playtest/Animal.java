package com.company.playtest;

public class Animal {

    private String name;

    public void speak(Animal a){
        System.out.println(a.getName());
    }

    public String getName() {
        return this.name;
    }
}
