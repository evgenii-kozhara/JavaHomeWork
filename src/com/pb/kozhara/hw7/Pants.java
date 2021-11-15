package com.pb.kozhara.hw7;

public class Pants extends Clothes implements  ManClothes, WomenClothes{
    public Pants() {
        super("Штани", Size.M, "Чорний", 40.00 );
    }
    @Override
    public void dressMan() {
        // System.out.println("Чоловік одягає штани.");
    }
    @Override
    public void dressWomen() {
        // System.out.println("Жінка одягає штани.");
        System.out.printf("\nТип одягу: %s", "\nЦіна: %s USD" + "\nРозмір: %s." + "\nКолір: %s. ", name, price, size, color);
    }
}
