package com.basic.D14_Abstract;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("√®≥‘√®¡∏....");
    }

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}
