package Lesson20.Lesson20b;

import java.util.ArrayList;

public class RetainAll {
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
        System.out.println("ArrayList 2= " + al2);

        // в листе al1 будут сохранены только те значения, которые есть в al2. Остальные значения в l1 будут удалены
        al1.retainAll(al2);

        System.out.println("ArrayList 1= " + al1);
    }
}
