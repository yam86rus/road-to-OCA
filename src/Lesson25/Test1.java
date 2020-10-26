package Lesson25;

import org.w3c.dom.ls.LSOutput;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        Employee [] array2 = {emp1, emp2, emp3};
        System.out.println(emp1 instanceof Employee); // объект emp1 это Employee? true 
        System.out.println(emp1 instanceof Teacher); // объект emp1 это Teacher? true
        System.out.println(emp1 instanceof Driver); // объект emp1 это Driver? false
//        for (Employee emp: array2){
//            emp.work();
//        }

//        Оператор instanceof проеверяет, есть ли между объектом и классом/интерфейсом связь IS-A.
//        Если связь IS-A невозможна, то помпилятор выдает ошибку.

    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee {
    @Override
    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee {
    @Override
    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee {
    @Override
    void work() {
        System.out.println("Doctor works");
    }
}


