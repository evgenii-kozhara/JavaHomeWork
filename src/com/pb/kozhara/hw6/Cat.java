package com.pb.kozhara.hw6;

public class Cat {
    public class Cat extends Animal {
        public Cat() {
            super("Покімог", "Віскас", "Будинок");
        }
        @Override
        public void eat() {
            System.out.printf("\nКіт естт %s.", getFood());
        }
        @Override
        public void makeNoise() {
            System.out.printf("\n%s говоритт спасибо", getName())
        }
        @Override
        public String toString() {
            return "Cat{" + "name=" + getName() + '\'' + ", food=" + getFood() + '\'' + ", location=" + getLocation() + '}';
        }
        @Override
        public int hashCode() {
            return Objects.hash(getName(), getFood(), getLocation());
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null) || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return
                    Objects.equals(getName(), cat.getName()) && Objects.equals(getFood(), cat.getFood()) && Objects.equals(getLocation(), cat.getLocation());
        }
    }
}
