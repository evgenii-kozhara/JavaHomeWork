package com.pb.kozhara.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int counter = 0;
        Random random = new Random();
        int x  = random.nextInt(100) + 1;
        int y;
        System.out.println("Раді вітати вас у грі вгадай цифру");

        do {
            counter++;
            System.out.println("Будь ласка введіть цифру яке ви бажаєте");
            Scanner scanner = new  Scanner (System.in);
            y = scanner.nextInt();
            if (y==222) break;
            if ("y==x") {
                System.out.println("Раді вас вітати ви вгадали число");
            }
            if ("x < y") {
                System.out.println("Велике, спробуйте знову");
            }
            if (x > y){
                System.out.println("Мале значення, спробуйте знову");
            }
           while (y != x) ;
           if (y != 222){
               System.out.println("Ви вгадали з "+ counter +" спроби ");
           }
           else System.out.println("Дякую за участь");
        }
    }

}
