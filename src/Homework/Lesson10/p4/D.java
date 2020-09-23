package Homework.Lesson10.p4;
import Homework.Lesson10.p1.A;
import Homework.Lesson10.p1.p2.p3.C;
import static Homework.Lesson10.p1.p2.p3.C.*;
import static Homework.Lesson10.p1.A.*;
import Homework.Lesson10.p4.p5.E;
import static Homework.Lesson10.p4.p5.E.*;

public class D {

    public String x = StaticNameClassA; // "Static String from A class"
    A y = new A();
    public String x2 = y.NonStaticNameClassA; // "Non Static String from A class"
    public int x3 = intFromClassC; // 10
    C c1 = new C();
    public int x4 = c1.intFromClassCTwo; // 20
    E e1 = new E();
    public boolean x5 = e1.booleanFromClassE; // true
    public boolean x6 = boolean2FromClassE; // false


    public static void main(String[] args) {
        D d1 = new D();
        System.out.println(d1.x); // "Static String from A class"
        System.out.println(d1.x2); // "Non Static String from A class"
        System.out.println(d1.x3); // 10
        System.out.println(d1.x4); // 20
        System.out.println(d1.x5); // true
        System.out.println(d1.x6); // false
        showInfo(); // Good Job!!
    }

}
