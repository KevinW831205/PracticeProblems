package com.company.playtest;

public class Mammal extends Animal {

    private String name = "m";
    @Override
    public void speak(Animal a) {
        super.speak(this);
    }
}
