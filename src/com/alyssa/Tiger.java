package com.alyssa;

public class Tiger extends Feline {

    @Override
    public void groupPreference() {
        System.out.println("Tigers stay solo.");
    }

    @Override
    public void hasFur() {
        System.out.println("Tigers have striped fur.");
    }

    @Override
    public void hasTeeth() {
        System.out.println("Tigers have teeth.");
    }
}
