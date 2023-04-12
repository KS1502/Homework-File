package Homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class Homework2 {
     public static void main(String[] args) throws IOException {

         File fileName = new File("ABC.txt");
         System.out.println(readIntoString(fileName));
          /* aaa bbbbbbb cc */

     }



    public static String readIntoString(File fileName) {
             String s = "";

             try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                 String line;

                 while ((line = br.readLine()) != null) {
                     s = s + " " + line;
                 }
             } catch (IOException e) {
                 e.getMessage();
             }

             return s;
         }

    }

/*  Есть  текстовый файл.  Написать метод,  читающий файл и
    возвращающий строку, состоящую из строчек этого файла,
    разделенных пробелом.
    Пример текстового файла:
    aaa
            bbbbbbb
    cc
    результат : aaa bbbbbbb cc */
