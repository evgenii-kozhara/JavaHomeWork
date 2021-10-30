package com.pb.kozhara.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            String line_in;
            System.out.println("Введите любую стоку:");
            line_in = in.nextLine();
            String toUpperCase = toUpperCase(line_in);
            System.out.println("Измененная строка: + toUpperCase");

        }
        static String toUpeerCase(String line_in)
        {
            String line_out="";
            String[] text_split2 = line_in.split(" ");
            for (int i = 0; i < text_split2.length; i++) {
                if (text_split2[i].length() >= 1) {
                    String word = text_split2[i];
                    word = word.substring(0,1).toUpperCase() + word.substring(1,word.length());
                    line_out = line_out + word + "";
                }
            else {
                line_out = line_out + "";
                }
            }
            return line_out;
        }
    }
}
