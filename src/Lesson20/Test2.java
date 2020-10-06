package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("Privet");
        list.add("Ok");
        list.add(1,"hello"); // Добавляет на первую позицию
//        list.add(5,"ok"); // IndexOutOfBoundsException: Index: 5, Size: 4
        for (String s: list){
            System.out.print(s + " ");
        }
        System.out.println(list.get(3));

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }


        list.set(1,"!!!");// изменить элемент с первым индексом
        System.out.println();
        for (String s: list){
            System.out.print(s + " ");
        }
    }
}
