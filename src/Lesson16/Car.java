package Lesson16;

import Homework.Lesson10.p1.p2.p3.C;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;


    public Car abc(String color){
        Car c10 = new Car(color,"V4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "v6");
        Car c2 = c.abc("black");
        System.out.println(c.color);
        System.out.println(c2.color);
    }
}

