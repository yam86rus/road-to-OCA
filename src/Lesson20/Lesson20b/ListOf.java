package Lesson20.Lesson20b;

import java.util.ArrayList;
import java.util.List;

public class ListOf {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        List<String> list = List.of("odin", "dva","tri");
        System.out.println("list = " + list);
        //этот List невозможно модифицировать
//        list.add("chetyre"); //UnsupportedOperationException мы не можеи изменять этот  лист
//        List не может содержать null . будет Exception
//        List<String> list3 = List.of("odin", "dva",null); //NullPointerException



        // второй метод принимает коллекию и возвращает неизменяемый лист
        List <String> list2 = List.copyOf(al1);
        System.out.println("list2 = " + list2);

//        list2.add("vosem");//UnsupportedOperationException тоже нельзя изменять
    }
}
