package Lesson20.Lesson20b;

import java.util.ArrayList;

public class ContainsAll {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("ArrayList 1= " + al1);

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("five");
        al2.add("ten");
        System.out.println("ArrayList 2= " + al2);
        // содержит ли ArrayList1 все элементы ArrayList2 ? если да - true, если нет - false
        boolean result = al1.containsAll(al2);
        System.out.println(result); // false так как в al1 нет елемента "ten"
    }
}
