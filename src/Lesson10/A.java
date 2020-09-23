package Lesson10;
import Homework.Lesson4.Student;
import Lesson9.*;
import static Lesson9.StudentTest.a;
//import static Lesson9.Car.AA;
//import static Lesson9.Car.count;
import static Lesson9.Car.*;
import Homework.Lesson4.*;
//import Lesson8.*;

public class A {
    public static void main(String[] args) {
        Lesson9.Car c2 = new  Lesson9.Car("black", "v6");
//        Lesson8.Student st2 = new Lesson8.Student("Ivan",2020);
//        System.out.println(StudentTest.a);

        System.out.println(a); // end of line comment
        System.out.println(AA);
        /*
        * multiline comment
        *   multiline comment
        *       multiline comment
        */

        System.out.println(count);
        /**
         * JavaDoc comment
         *   JavaDoc comment
         *     JavaDoc comment
         */

    }
}

class  B {
    Lesson9.Student st1 = new  Lesson9.Student();

}

class C{
    Student st2 = new Student();

}

class D{

}


