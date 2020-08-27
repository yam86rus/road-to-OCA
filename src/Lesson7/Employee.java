package Lesson7;

public class Employee {
    public Employee(double salary2) {
        salary = salary2;
    }

    public double salary;

    public void dvoynayZP() {
        double result = salary*2;
        System.out.println("Новая з/п: " + result);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayZP();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayZP();
    }
}

