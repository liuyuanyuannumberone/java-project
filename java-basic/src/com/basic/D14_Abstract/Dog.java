package com.basic.D14_Abstract;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("¹·¿Ð¹ÇÍ·...");
    }

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }


}
