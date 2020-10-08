package Lesson20.Lesson20b;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("ArrayList 1= " + al1);

        List<String> sublist = al1.subList(1,3); //из al1 выбираем элементы с 1-ого по 3-й не включительно и записываем в List
        System.out.println("sublist = " + sublist);
        sublist.add("ten");
        System.out.println("sublist = " + sublist);
        System.out.println("ArrayList 1 = " + al1);
        al1.add("million");
        System.out.println("ArrayList 1 = " + al1);
//        System.out.println("sublist = " + sublist); //ConcurrentModificationException
        // т.к. все структурные модификации должны быть сделаны с помощью нашего view


    }
}
