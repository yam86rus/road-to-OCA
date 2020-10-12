package Lesson22;

public class Test3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.work();
        doc.specializacia = "Хирург";
    }
}

class Employee extends java.lang.Object {
    String name;
    int age;
    int experience;
    double salary = 100;

    void uveliczp (Employee e){
        e.salary +=100;
    }
    void sleep() {
        System.out.println("Спасть");
    }

    void eat() {
        System.out.println("кушать");
    }

}

class Doctor extends Employee {
    String specializacia;
    void work() {
        System.out.println("Лечить");
    }
}

class Xixurg extends Doctor{
    String skalpel;
    void operatia (){}
}

class Dantist extends Doctor{
    String instrument;
}

class Teather extends Employee{
    void teach() {
        System.out.println("Учить");
    }
}

class Driver extends Employee{
    void Drive() {
        System.out.println("Водить");
    }
}