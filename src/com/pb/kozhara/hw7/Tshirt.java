package com.pb.kozhara.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    public Tshirt() {
        super("Футболка", Size.XS,"Чорний", 35);
    }
    @Override
    public void dressMan() {
        // System.out.println("Мужчина одягає футболку.");
    }
    @Override
    public void dressWomen() {
        //  System.out.println("Жінка одягає футболку.");
        System.out.printf("\nТип одягу: %s", "\nЦіна: %s USD" + "\nРозмір: %s." + "\nКолір: %s. ", name, price,size,color);
    }
}
