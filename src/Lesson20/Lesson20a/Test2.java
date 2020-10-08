package Lesson20.Lesson20a;

import java.util.Arrays;

// compare
// mismatch
public class Test2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};
        int[] array5 = {1, 2, 3, 5};

        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array6 = {'p', 'r', 'i', 'v', 'e', 't','o'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
        char[] array7 = null;
        char[] array8 = null;

        System.out.println(Arrays.compare(array1,array2)); // метод возвращает меньше нуля, когда первый массив меньше второго
        System.out.println(Arrays.compare(array2,array1)); // метод возвращает больше нуля, когда первый массив больше второго
        System.out.println(Arrays.compare(array2,array5)); // метод возвращает ноль, когда первый массив равен блинне второго

        System.out.println(Arrays.compare(array3,array4));
        System.out.println(Arrays.compare(array3,array6));
        System.out.println(Arrays.compare(array3,array7));
        System.out.println(Arrays.compare(array7,array8));

        // -----------  методе compare сравнивать разные типы массивов нельзя
//        System.out.println(Arrays.compare(array5,array3)); // ошибка компилатора, нет такого метода



        // mismatch
        System.out.println(Arrays.mismatch(array2,array5)); // если массивы одинаковые то, mismatch возвращает -1
        System.out.println(Arrays.mismatch(array1,array2)); // если массивы разные то, mismatch возвращает индекс элемента первого расхождения
        System.out.println(Arrays.mismatch(array3,array6)); // тоже самое для Array типа char. если массивы разные то, mismatch возвращает индекс элемента первого расхождения



    }
}
