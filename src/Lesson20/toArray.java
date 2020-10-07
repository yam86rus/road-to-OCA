package Lesson20;

import java.util.*;

public class toArray {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        Object [] array1 = list1.toArray(); // cоздаем массив типа Object и записываем в него ArrayList list1 через метод toArray()
        for(Object o: array1){
            System.out.println(o);
        }
        System.out.println();

        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);
        for(StringBuilder sb: array2){
            System.out.println(sb);
        }

        StringBuilder[] array = {sb2,sb3,sb3,sb3};
        List <StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);

        array[0].append("!!!");
        System.out.println(list8);

        array[0] = new StringBuilder("!!!");
        System.out.println(list8);

    }
}
