package Lesson6;

import Homework.Lesson5.Employe;

public class Employee {

     Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

     Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    public Employee(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }


    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);

        Employee emp2 = new Employee("Petrov", 25);
        System.out.println(emp2.surname);

        Employee emp3 = new Employee(2, "Sidirov", 29, 25000, "OPKB");
        System.out.println(emp3.department);
    }
}