package com.pb.kozhara.hw9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    public static void createNumbersFile() throws IOException {
        Path path = Files.createFile(Paths.get("C:\\Users\\dn270298kej\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\kozhara\\hw9\\numbers\"));
    Random r = new Random();
    int[] arr = new int[100];
    for (int i = 0; i < arr.length; i++)
        arr[i] = r.nextInt(100);
    try (BufferedWriter w = Files.newBufferedWriter(path)) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 10 == 0 && i != 100)
                w.write("\n" + arr[i] + " ");
            else
                w.write(arr[i] + " ");
        }
    }
    }
    public static void createOddNumbersFile() throws IOException {
        Path path = Paths.get("Windows-SSD(C):\\Users\\38099\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\kozhara\\hw9\\numbers\"))
    try (BufferedWriter w = Files.newBufferedWriter(annotherPath)) {
        for (int n = 0; n <= array.length - 1; n++) {
            if (n % 10 == 0) {
                w.write("\n" + array[n] + " ");
            }
            else
                w.write(array[n] + " ");
        }
        }
    }catch(Exception e) {
        e.printStackTrace();
    }
    public static void main(String[] args) {
        try {
            createNumbersFile();
            createOddNumbersFile();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
