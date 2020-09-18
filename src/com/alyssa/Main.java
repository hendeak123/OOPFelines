package com.alyssa;

public class Main {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.groupPreference();
        tiger.hasFur();
        tiger.hasTeeth();
        Lion lion = new Lion();
        lion.groupPreference();
        lion.hasFur();
        lion.hasTeeth();
    }
}

abstract class Feline {
    public abstract void groupPreference();
    public abstract void hasFur();
    public abstract void hasTeeth();
}

