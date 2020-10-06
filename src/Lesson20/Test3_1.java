package Lesson20;
import java.util.ArrayList;

public class Test3_1 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("Петров");
        StringBuilder sb3 = new StringBuilder("Сидоров");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        ArrayList <StringBuilder> list2 = new ArrayList<>();
        StringBuilder sb4 = new StringBuilder("Новый стринг билдер");
        StringBuilder sb5 = new StringBuilder("номер sb5");
        list2.add(sb4);
        list2.add(sb5);


        for (StringBuilder s : list){
            System.out.print(s + " ");
        }
        list.remove("123"); //я не понимаю почему не удаляется (
        System.out.println();
        System.out.println("--------");
        for (StringBuilder s : list){
            System.out.print(s + " ");
        }

//        list.add(list2);
    }
}
