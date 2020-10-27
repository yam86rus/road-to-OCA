package Lesson25;

public class Test9 {
}

class Employee1 {
    void sleep() {
        System.out.println("Employee sleeps");
    }
}

class Doctor1 extends Employee1 {
    void sleep() {
        System.out.println("Doctor sleeps");
    }
}

class Test20{
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1();

    }
}
