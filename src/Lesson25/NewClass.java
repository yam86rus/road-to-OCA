package Lesson25;

public class NewClass {
}

class Car {
    static int A = 5;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.A);
        c=null;
        System.out.println(c.A);
    }
}