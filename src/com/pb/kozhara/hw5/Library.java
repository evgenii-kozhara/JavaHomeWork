package com.pb.kozhara.hw5;

import java.io.IOException;
import java.io.Reader;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[1] = new Book("Энциклопедия", "Гусев К. В." 2010);
        books[2] = new Book("Словарь", "Сидоров А. В" 1980);
        books[3] = new Book("Приключения", "Иванов И. И." 2000);
        Reader[] readers = new Reader[3];
        readers[1] = new Reader("Петров В.В.", 20022, "історична","28/05/01", "+3809994631137");
        readers[2] = new Reader("Васичкин М.М.", 20023, "економічна", "18/08/07", "+380662568904");
        readers[3] = new Reader("Клиенко С.В.", 19876, "Філософська", "03/11/83", "+380997421734");
    }
    System.out.println("Книги: ");
    for (int i = 0; i < books.length; i++) {
        System.out.println(books[i].getBookInfo());
    }
    System.out.println("\nЧитачі: ");
    for(int i = 0; i < readers.length; i++) {
        System.out.println(readers[i].getReaderInfo());
    }
    // takeBook()
    System.out.println();
    readers[0].returnBook();
    readers[0].returnBook("Энциклопедия", "Словарь", "Приключения");
    readers[2].returnBook(books[1], books[2], books[3]);
}
