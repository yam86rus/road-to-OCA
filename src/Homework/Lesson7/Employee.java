package Homework.Lesson7;

import Homework.Lesson5.Employe;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2){
        surname = surname2;
    }

    private Employee(double salary2){
        salary = salary2;
    }

    public void showId() {
        System.out.println("ID: " + id);
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
    }

    public void showSurname() {
        System.out.println("Surname: " + surname);
    }

    public static void main(String[] args) {
        Lesson7.Employee emp = new Lesson7.Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayZP();
    }
}
