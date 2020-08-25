package Lesson4;

public class Car {

    String color = "red";
    String engine = "V6";

}

class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "black";
        car.engine = "v12";
        System.out.println("Цвет: " + car.color);
        System.out.println("Мотор: " + car.engine);
    }
}
