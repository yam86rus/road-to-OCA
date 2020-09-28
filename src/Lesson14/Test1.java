package Lesson14;

import java.util.Scanner;

public class Test1 {

    public int enterNumber(){
        System.out.println("Введите финальное число");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        return n;
    }

    public static void main(String[] args) {
        for(int i=1, a=1,c=3; i<=20 & 2<=20;i++, a+=3) {
            System.out.println("Lesson 14");
        }
        System.out.println("hello");
    }
}
