package Lesson20;
import java.util.ArrayList;
public class Test3_3 {
    static void showInfo(ArrayList array){
        for(int i=0; i< array.size(); i++){
            System.out.print(array.get(i)+ " ");
        }
        System.out.println();
        System.out.println("-------------");
    }
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Ноль");
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        showInfo(list);
        list.remove("Три");
        showInfo(list);
        System.out.println(list.indexOf("Два"));
        System.out.println(list.toString());
    }
}
