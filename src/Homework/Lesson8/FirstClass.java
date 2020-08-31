package Homework.Lesson8;

public class FirstClass {

    public final static double PI = 3.14;

    public static double umnojenie(double a, double b, double c) {
        return a * b * c;
    }

    public static void delenie(double a, double b) {
        System.out.println("целое " + a / b);
        System.out.println("остаток от деления " + a % b);
    }

    //    Площадь круга
    public double AreaOfCircle(double r) {
        return PI * r * r;
    }

    //    Длина окружности
    public static double lengthOfCircle(double r) {
        return 2 * PI * r;
    }

    //    вся информация по радиусу
    public void info(double r) {
        System.out.println("Радиус: " + r);
        System.out.println("Площадь круга: " + AreaOfCircle(r));
        System.out.println("Длина окружности: " + lengthOfCircle(r));
    }
}
