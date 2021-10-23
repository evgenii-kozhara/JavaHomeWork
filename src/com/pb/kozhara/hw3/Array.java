package com.pb.kozhara.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // створюємо масив
        Scanner scanner = new Scanner(System.in);
        int numbers = 10;
        int[] array = new int[numbers];

        // Просимо користувача заповнити масив
        for (int i = 0; i < array.length; i++ ) {
            System.out.println("Введіть наступну будь ласка цифру:");
            array[i] = scanner.nextInt();
        }
        // Виводим на екран масив
        System.out.println("Ваш масив:");
        for (int j : array) {
            System.out.println(j);
        }
        //Ведем підрахунок суми масиву
        int resultSum = 0;
        for (int j : array) {
            resultSum = resultSum + j;
        }
        System.out.println("Сума елементів" + resultSum);

        //Ведем підрахунок позитивних числ
        int countPositive = 0;
        for (int k :array) {
            if (k > 0) {
                countPositive++;
            }
        }
        System.out.println("Кількість позитивних спроб:" + countPositive);
        //Сортируємо масив
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    sorted = false;
                    temp = array[i];
                    array[i] =  array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        // Виводимо на екран відсортрований масив
        System.out.println("Ваш відсортований масив:");
        for (int j :array) {
            System.out.println(j);
        }
    }
}
