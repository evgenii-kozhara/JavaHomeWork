package com.pb.kozhara.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int interval;
        System.out.println("Введіть ціле число");
        scanner = interval.nextInt();
        if (interval >= 0 && interval <= 14) {
            System.out.println("Ваше число потрапило в інтервал [0 -14]");
        } else if (interval >= 15 && interval <= 35);{
        System.out.println("Ваше число потрапило в інтервал  [15 - 35]");
        } else if (interval >= 36 && interval <= 50);{
        System.out.println("Ваше число потрапило в інтервал  [36 - 50]");{
        } else if (interval >= 51 && interval <= 100);{
        System.out.println("Ваше число потрапило в інтервал  [51 - 100]");
        } else System.out.println("Ваше число потрапило в інший інтервал");
}
