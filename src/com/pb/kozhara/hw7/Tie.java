package com.pb.kozhara.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie() {
        super("Галстук", Size.XXS, "Голубий", 98.50);
    }
    @Override
    public void dressMan() {
        // System.out.println("Мужчина одягає галстук.");
        System.out.printf("\nТип одягу: %s", "\nЦіна: %s USD" + "\nРозмір: %s." + "\nКолір: %s. ", name, price, size, color);
    }
}
