package Homework.Lesson18;

import java.util.Arrays;

public class Test1 {

    public static int[] sortirovka(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void showArray(String[][] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print("{");
            for (int j = 0; j < args[i].length; j++) {
                System.out.print(args[i][j]);

            }
            System.out.print("}");
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 65, 54, 78, 6};
        String[][] array2 = {{"Иван", "Марья"}, {"Петр", "Дарья"}, {"Настасья"}};
        System.out.println(sortirovka(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println("-------");
        showArray(array2);
    }
}
