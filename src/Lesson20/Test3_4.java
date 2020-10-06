package Lesson20;

import java.util.ArrayList;

public class Test3_4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Один");
        StringBuilder sb2 = new StringBuilder("Два");
        StringBuilder sb3 = new StringBuilder("Три");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        StringBuilder sb4 = sb1;
//        list.remove("Два");
        list.remove(sb4);
        for(StringBuilder s: list){
            System.out.print(s + " ");
        }
    }
}
