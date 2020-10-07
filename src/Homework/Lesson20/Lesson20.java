package Homework.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {
    static ArrayList <String> abc (String... s){
        ArrayList <String> list = new ArrayList<>();
        for (String s1: s){
            if(!list.contains(s1))
            list.add(s1);
        }
        Collections.sort(list);
        return list;
    };

    public static void main(String[] args) {
        System.out.println(abc("A", "D", "B","C","B","B","A","E"));
        System.out.println(abc("privet", "poka", "privet","kak dela?","ok","hello"));
    }
}


