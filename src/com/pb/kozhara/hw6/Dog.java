package com.pb.kozhara.hw6;

import java.util.Objects;

public class Dog extends Animal {
    public Dog() {
        super("Рей", "Каша", "вольер");
    }
    @Override
    public void eat() {
        System.out.printf("\nСобака їсть %s.", getFood());
    }
    @Override
    public void makeNoise() {
        System.out.printf("\n%s говорить гав-гав", getName());
    }
    @Override
    public String toString() {
        return "Dog{" + \"name=\" + getName() + '\'' + ", food =" + getFood() + '\'' + ", location=" + getLocation() + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())) return false;
        Dog dog = (Dog) o;
        return
                Objects.equals(getName(), dog.getName()) && Objects.equals(getFood(), dog.getFood()) && Objects.equals(getLocation(), dog.getLocation());
    }
}
