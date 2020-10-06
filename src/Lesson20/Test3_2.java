package Lesson20;
import java.util.ArrayList;
public class Test3_2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Иванов");
        list.add("Петров");
        list.add("Сидоров");
//        list.add("Иванов");

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Значение из нового ArrayList");
        list2.add("Которе храниться в list2");


        for (String s: list){
            System.out.println(s + " ");
        }
        System.out.println();
        System.out.println("-----");

//        list.remove( "Иванов");
//        for (String s: list){
//            System.out.println(s + " ");
//        }

        System.out.println();

        list.addAll(0,list2);
        for (String s: list){
            System.out.print(s + " ");
        }
    }
}
