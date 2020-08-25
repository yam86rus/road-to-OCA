package Lesson4;

public class Car {
    Car(){
        color = "Красный";
        engine = "V8";
    }
    String color ;
    String engine ;

}

class CarTest {
    public static void main(String[] args) {
        Car car2 = new Car();
        System.out.println(car2.color);
        System.out.println(car2.engine);
    }
}
