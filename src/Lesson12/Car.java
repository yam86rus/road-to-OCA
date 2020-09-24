package Lesson12;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }

    public static void foo(Car car1, Car car2) {
        if (car1 == car2) {
            System.out.println("Адреса объектов совпадают");
        } else {
            System.out.println("Адреса объектов разные");
        }
    }

    public static void foo1(String name1, String name2) {
        if (name1.equals(name2)) {
            System.out.println("Значения в String - одинаковые");
        } else {
            System.out.println("Значения в String - разные");
        }
    }

    public static void theSame(String str1, String str2){
        System.out.println(str1.equals(str2) ? "СТРОКИ ОДИНАКОВЫЕ" : "СТРОКИ РАЗНЫЕ");
    }

    public static void maximum(int i1, int i2, int i3) {
        if (i1 > i2 & i1 > i3) {
            System.out.println(i1);
        } else if (i2 > i1 & i2 > i3) {
            System.out.println(i2);
        } else {
            System.out.println(i3);
        }
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3, 6);
        Car c2 = new Car(2, 5);
        Car c3 = c1;

        int a = 10;
        int b = 20;
        int maxim = (a > b) ? a : b;

        String name1 = "Maxim";
        String name2 = "Maxim";
        String name3 = "Vasya";

        if (c1.engine > c2.engine) {
            if (c1.doorCount > c2.doorCount) {
                System.out.println("мощность мотора и количество дверей у первой машины больше");
            } else {
                System.out.println("Мощность мотора первой машины больше, а количество дверей меньше");
            }
        } else {
            System.out.println("Мощность мотора у первой машины меньше");
        }

        Car.foo(c1, c3);
        Car.foo1(name1, name2);
        Car.maximum(10, 50, 25);
        Car.theSame(name1,name2);
        Car.theSame(name2,name3);


    }
}