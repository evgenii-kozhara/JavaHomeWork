package com.pb.kozhara.hw7;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt() {
        super("Спідниця", Size.L, "червоний", 25.00);
    }
    @Override
    public void dressWomen() {
        // System.out.println("Жінка одягає спідницю.");
        System.out.printf("\nТип одягу: %s", "\nЦіна: %s USD" + "\nРозмір: %s." + "\nКолір: %s. ", name, price, size, color);
    }
}
