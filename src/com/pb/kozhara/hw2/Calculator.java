package com.pb.kozhara.hw2;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int operand1;
                int operand2;
         System.out.println("Введіть цифру №1");
                 operand1 = scanner.nextInt();
         System.out.println("Введіть цифру №2");
                 operand2 = scanner.nextInt();
         String sign;
         System.out.println("Введіть знак");
         sign=scanner.next();
         int result;
         switch (sign){
             case "+":
                 result=operand1 + operand2;
                 System.out.println(result);
             break;
             case "-":
                 result=operand1 - operand2;
                 System.out.println(result);
             break;
             case "/":
                 if (operand2 == 0) {System.out.println("Ділення заборонене");}
             else {
                 result=operand1 / operand2;
                 System.out.println(result);
             break;
             case "*":
                 result=operand1 * operand2;
                 System.out.println(result);
                 break;
             default:
                 System.out.println("Операція не розпізнана повторіть будь ласка повторно");
             break;
                 }
         }