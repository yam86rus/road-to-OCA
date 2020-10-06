package Lesson20;
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        StringBuilder sb4 = new StringBuilder("привет - привет");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list.add(sb4);
        for(int i=0; i<list.size(); i++){
            list.get(i).append("!!!");
        }
        for(StringBuilder s: list){
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("--------");

        list.remove(2); // удаляет второй элемент
        for(StringBuilder s: list){
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("--------");

        list.remove(sb1); // удаляет по объекту
        for(StringBuilder s: list) {
            System.out.print(s + " ");
        }
//        StringBuilder sb4 = new StringBuilder("привет - привет");
//        list.add(sb4);
//        for(StringBuilder s: list){
//            System.out.print(s + " ");
//        }
            list.remove("ok!!!"); // я не понимаю почему не удаляется (
        System.out.println("");
        System.out.println("--------");
            for (StringBuilder s : list) {
                System.out.print(s + " ");
            }

//        list.remove(3); //IndexOutOfBoundsException: Index 3 out of bounds for length 2

    }
}
