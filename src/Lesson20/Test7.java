package Lesson20;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();

        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        ArrayList<String> list2 = list1;

        ArrayList<String> list3 = new ArrayList<>();
        list3.add(s3);
        list3.add(s1);
        list3.add(s4);
        list3.add(s2);

        ArrayList<String> list4 = new ArrayList<>();
        list4.add(s3);

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println(list1.equals(list2)); // сравнивает два ArrayList true
        System.out.println(list1.equals(list3)); // сравнивает два ArrayList false. Порядок важен
        // метод equals в ArrayList перезаписан
        System.out.println(list1.equals(list4)); // false

    }
}
