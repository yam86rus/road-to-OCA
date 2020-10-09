package Lesson20.Lesson20b;

import java.util.ArrayList;

public class ToArray {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("ArrayList 1= " + al1);
        Object[] array = al1.toArray(); // Переводим в массив типа Object

        String[] array2 = al1.toArray(new String[0]); //Java проверяет что размер массива должен быть больше и сама ставим нужный
        for (String s : array2) {
            System.out.print(s + " ");
        }
    }
}
