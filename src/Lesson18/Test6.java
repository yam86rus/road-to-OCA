package Lesson18;

import java.util.Arrays;

public class Test6 {
    // мой вариант
    static void foo(int[] array) {
        Arrays.sort(array);
        System.out.println("максимальное число в массиве " + array[array.length - 1]);
        System.out.println("минимальное число в массиве " + array[0]);
        System.out.println("--------------");
    }

    // вариант из курса
    public static void maxmin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
    }

    public static void main(String[] args) {
        int[] ar = {10, 20, 40, -50, 70, 50};
        foo(ar);// мой вариант
        maxmin(ar); //вариант из курса
        maxmin(new int[]{21, -6, 54, 4, -22, 26}); //вариант из курса
    }
}
