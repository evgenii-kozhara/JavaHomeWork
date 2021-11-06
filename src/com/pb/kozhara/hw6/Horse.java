package com.pb.kozhara.hw6;

import java.util.Objects;

public class Horse extends Animal {
    public Horse() {
        super("Крикун", "Жито", "Сарай");
    }
    @Override
    public void eat() {
        System.out.printf("\nКінь їсть %s.", getFood());
        @Override
        public void makeNoise() {
            System.out.printf("\n%s говорить і-го-го", getName());
        }
        @Override
        public String toString() {
            return "Horse{" + "name=" + getName() + '\'' +", food=" + getFood() + '\'' + ", location=" + getLocation() + '}';
        }
        @Override
        public int hashCode() {
            return Objects.hash(getName(), getFood(), getLocation());
        }
        @Override
        public boolean eqals(Object 0) {
            if (this == 0) return true;
            if (0 == null || getClass() != 0.getClass()) return false;
            Horse horse = (Horse) 0;
            return
                    Objects.equals(getName(), horse.getName()) &&
                            Objects.equals(getFood(), horse.getFood())
                            && Objects.equals(getLocation(), horse.getLocation());
        }

    }

}
