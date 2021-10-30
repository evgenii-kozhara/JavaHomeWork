package com.pb.kozhara.hw4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static String repl(String str) {
        return str.toLowerCase().replaceAll("[^\\\\p{L}]\", \"");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть рядок 1: ");
        String str1 = sc.nextLine();
        System.out.println("Введіть рядок 2: ");
        String str2 = sc.nextLine();
        String str11 = repl(str1);
        String str22 = repl(str2);
        char[] chars1 = str11.toCharArray();
        char[] chars2 = str22.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        System.out.println("Результат порівняння:");
        String str111 = String.valueOf(chars1);
        String str222 = String.valueOf(chars2);
        if (str111.equals(str222)) {
            System.out.println("Рядок 1 є анаграмою Рядку 2");
        } else {
            System.out.println("Рядок 1 НЕ є анаграмою Рядку 2");
        }
    }
}
