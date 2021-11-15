package com.pb.kozhara.hw7;

public class Atelier {
    public static void dressMan(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof ManClothes) {
                System.out.println("\nТип одягу: " + cloth.getName() + "\nЦіна: " + cloth.getPrice() + " USD" + "\nРозмір: " + cloth.getSize() + "\nКолір: " + cloth.getColor());
            }
        }
    }
    public static void dressWomen(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenClothes) {
                System.out.println("\nТип одягу: " + cloth.getName() + "\nціна: " + cloth.getPrice() + " USD" + "\nРозмір: " + cloth.getSize() + "\nКолір: " + cloth.getColor());
            }
        }
    }
    public static void main(String[] args) {
        Clothes tshirt = new Tshirt();
        Clothes tie = new Tie();
        Clothes pants = new Pants();
        Clothes skirt = new Skirt();
        Clothes[] collection = {tshirt, tie, pants, skirt};
        System.out.println("Чоловіча колекція: ");
        dressMan(collection);
        System.out.println();
        System.out.println("жіноча колекція: ");
        dressWomen(collection);
    }
}
