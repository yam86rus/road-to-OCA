package Lesson23;


public class Test2 {

    public Object abc(){
        return new String();
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Teatcher t = new Teatcher();
        Driver driver = new Driver();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
//        emp1.lechit(); // в типе данных Employee нет метода lechit

        Employee emp2 = new Teatcher();
        Employee emp3 = new Driver();

        Xirurg x = new Xirurg();
        Doctor d1 = new Xirurg();
        System.out.println(d1.age);
        System.out.println(d1.name);
        System.out.println(d1.salary);
        System.out.println(d1.experience);
        d1.eat();
        d1.sleep();
        d1.lechit();
//        d1.operatia;// у класса Doctor нет метода
        //        Xirurg x2 = new Doctor(); нельзя
        Employee emp4 = new Xirurg();

//        Driver driver1 = new Employee(); // нельзя
    }
}


class Employee  {
    String name;
    int age;
    int experience;
    double salary = 100;

    void sleep() {
        System.out.println("Спасть");
    }
    void eat() {
        System.out.println("кушать");
    }

}

class Doctor extends Employee {
    String specializacia;

    void lechit() {
        System.out.println("Лечить");
    }
}

class Xirurg extends Doctor{
    String skalpel;
    void operatia(){}
}

class Teatcher extends Employee {
    void teach() {
        System.out.println("Учить");
    }
}

class Driver extends Employee {
    void Drive() {
        System.out.println("Водить");
    }
}
