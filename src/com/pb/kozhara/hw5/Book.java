package com.pb.kozhara.hw5;

public class Book {
    private static int bookCount = 0;
    public static int getBookCount () {
        return bookCount;
    }
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void  setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public String getBookInfo() {
        return "[Назва: " + title + ", автор: " + author + ", рік видання: " + year + "]";
    }
}