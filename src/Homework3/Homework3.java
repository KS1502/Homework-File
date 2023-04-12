package Homework3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;



public class Homework3 {
    public static void main(String[] args) throws IOException {

        File fileName = new File("AgeName.txt");
        try {
            Path path = Paths.get("AgeName.txt");
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    /*Есть  не пустой текстовый файл, состоящий из строчек, содержащих
        имя и возраст такого вида:
        John, 3
        Jack, 23
        Jill, 19
        Bill, 15
        Ann, 54
        Написать метод, читающий файл и возвращающий список из людей
        старше 18 лет отсортированный по возрасту.*/