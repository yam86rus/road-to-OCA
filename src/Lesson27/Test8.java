package Lesson27;

import Homework.Lesson10.Test;

import java.io.*;

public class Test8 {
    static int abc() {
        File file = new File("test10.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман");
            return 6;
        } finally {
            System.out.println("Это блок finaly");
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
