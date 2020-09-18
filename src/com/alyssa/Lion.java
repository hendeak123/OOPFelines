package com.alyssa;

public class Lion extends Feline {

    @Override
    public void groupPreference() {
        System.out.println("Lions live in groups.");
    }

    @Override
    public void hasFur() {
        System.out.println("Lions have plain fur.");
    }

    @Override
    public void hasTeeth() {
        System.out.println("Lions have teeth.");
    }
}
