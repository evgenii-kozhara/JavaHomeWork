package com.pb.kozhara.hw11;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.add(new Contact("Кожара Євгеній Юрійович", LocalDate.parse("1998-02-27"), "+380994631137", "Дом дома"));
        contactBook.add(new Contact("Кожара Юрій Івінович", LocalDate.parse("1975-09-29"), "+380662568904", "Город, улица"));
        contactBook.add(new Contact("Кожара Валентина Миколаївна", LocalDate.parse("1973-11-117"), "+380952596748", "Страна"));
        contactBook.mainMenu();
    }
}
