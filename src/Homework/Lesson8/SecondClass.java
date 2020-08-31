package Homework.Lesson8;

public class SecondClass {
    public static void main(String[] args) {
//        Первое задание
        System.out.println(FirstClass.umnojenie(1,2,3));
        FirstClass.delenie(10, 3);

//        Второе задание
        FirstClass item1 = new FirstClass();
        System.out.println(item1.AreaOfCircle(10));
        System.out.println(FirstClass.lengthOfCircle(10));
        item1.info(10);
    }
}
