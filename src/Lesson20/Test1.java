package Lesson20;
// ArrayList <DataType> list1 = new ArrayList <DataType>();
// ArrayList <DataType> list1 = new ArrayList <>(); второй стринг не нужен, поэтому можно указывать так

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("OK"));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Poka");
//        list2.add(s); // элементами ArrayList указано что являются только String
//        ArrayList <int> listPrimitiveDataType = new ArrayList<>();  Нельзя создавать ArrayList c primitive DataType!! Только reference DataType
        ArrayList<StringBuilder> list3 = new ArrayList<>();
        List<StringBuilder> list4 = new ArrayList<>(); // List тоже самое что и ArrayList

        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2==list5); // false , потому что ссылаются на разные объектыв
    }
}

class Car {
}

class Student {
}
