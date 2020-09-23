package Homework.Lesson9;

public class Car {
    String model;
    String color;
    String engine;
    int year;
    static int count;

    Car(String model, String color, String engine, int year){
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.year = year;
        count++;
    }

    Car(){

    };

    Car (String model){
        this(model,null,null,0);
    }

    Car (String model, String color) {
        this(model,color,null,0);
    }

    Car (String model, String color, String engine) {
        this(model, color,engine,0);
    }

    static int showCount (){
        return count;
    }

    static void creacteCar(){
        Car carTest1 = new Car("Audi",null,null,2015);
        Car carTest2 = new Car("BMW","Black","v8",2020);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda");
        Car.creacteCar();
        Car.creacteCar();
        Car car2 = new Car("Nissan","white","v12",2019);
        Car car3 = new Car("Audi",null,null,2019);
        Car car4 = new Car("Ford",null,"v12",2019);
        System.out.println(Car.showCount());
        car3 = null;
        car4 = null;

    }
}
