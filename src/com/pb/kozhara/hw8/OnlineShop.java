package com.pb.kozhara.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auth auth = new Auth();
        String login, password, confirmPassword;
        System.out.println("Реєстрація");
        System.out.println("Введіть login: ");
        login = scanner.nextLine();
        System.out.print("Введіть password: ");
        password = scanner.nextLine();
        System.out.println("Повторіть password: ");
        confirmPassword = scanner.nextLine();
        int success = 0;
        try {
            auth.signUp(login, password, confirmPassword);
            System.out.println("Реєстрація виконана успішно!");
            success = 1;
        }catch (WrongLoginException | WrongPasswordException s) {
            System.out.println(s.getMessage());
        }
        if (success == 1) {
            System.out.println("Вхід на сайт: ");
            System.out.println("Введіть login: ");
            login = scanner.nextLine();
            System.out.println("Введіть password: ");
            password = scanner.nextLine();
            try {
                auth.signUp(login, password);
                System.out.println("Вхід виконано успішно!");
            }catch (WrongLoginException s) {
                System.out.println(s.getMessage());
            }
        }
    }
}
