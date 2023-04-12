package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class Homework {
    public static  void main(String[] args)  {
        List<String> strings = new ArrayList<>(List.of("aaa", "bbbbbbb", "cc"));
        System.out.println(findLongest(strings));


    }


/* 2. Есть  файл, состоящий из строчек текста.  Написать метод,
    читающий файл и находящий самую длинную строчку в этом файле.
    Метод возвращает эту строчку
    Пример текстового файла:
    aaa
            bbbbbbb
    cc
    результат :  bbbbbbb */

    public static String findLongest(List<String> list) {
        String maxLengthElement = list.get(0);
        int indexMaxLengthElement = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxLengthElement.length()) {
                maxLengthElement = list.get(i);
                indexMaxLengthElement = i;

            }
        }
        return maxLengthElement;
    }
    /*  bbbbbbb  */







}
