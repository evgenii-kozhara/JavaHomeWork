package com.pb.kozhara.hw12;

import com.pb.kozhara.hw11.ContactBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactBook = new ContactBook();
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в телефонный справочник!");
        System.out.println("Для поиска введите 'search'");
        System.out.println("Для добавления контакта введите 'add'");
        System.out.println("Для удаления контакта введите 'remove'");
        System.out.println("Для отображения списка контактов введите 'show'");
        System.out.println("Для сортировки по ФИО введите 'names'");
        System.out.println("Для сортировке по дате рождения введите 'dates'");
        System.out.println("Для редактирования пользователя введите 'modify");
        System.out.println("Для вывода книги в JSON введите 'output'");
        System.out.println("Для запись в книгу из JSON введите 'input'");
        System.out.println("Для выхода введите 'quit'");
        String input = scan.nextLine();
        boolean run = true;
        while (run) {
            switch (input) {
                case "add":
                    contactBook.Add();
                    System.out.println("Введите новый запрос: ");
                    input = scan.nextLine();
                    break;
                case "search":
                    contactBook.Search();
                    System.out.println("Введите новый запрос: ");
                    input = scan.nextLine();
                    break;
                case "remove":
                    contactBook.Remove();
                    System.out.println("Введите новый запрос: ");
                    input = scan.nextLine();
                    break;
                case "modify":
                    contactBook.Modify();
                    System.out.println("Введите новый запрос: ");
                    input = scan.nextLine();
                    break;
                case "show":
                    System.out.println(contactBook.showContactBook());
                    System.out.println("Введите новый запрос: ");
                    input = scan.nextLine();
                    break;
                case "nameshow":
                    System.out.println(contactBook.SortByName());
                    System.out.println("Введите новый запрос: ");
                    input = scan.nextLine();
                    break;
                case "dateshow":
                    System.out.println(contactBook.SortByDateOfBirth());
                    System.out.println("Введите новый запрос: ");
                    input = scan.nextLine();
                    break;
                case "output":
                    contactBook.toFile();
                    System.out.println("Введите новый запрос: ");
                    input = scan.nextLine();
                    break;
                case "input":
                    contactBook.fromFile();
                    input = scan.nextLine();
                    break;
                case "quit":
                    run = false;
                    System.out.println("До встречи!");
                    break;
                default:
                    System.out.println("Неверный запрос. Попробуйте снова.");
                    input = scan.nextLine();
                    break;
            }
        }
    }
}
