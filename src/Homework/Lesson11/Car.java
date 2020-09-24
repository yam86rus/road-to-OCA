package Homework.Lesson11;

public class Car {
    String color;
    String engine;
    int doorCount;

    Car (String color, String engine, int doorCount){
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

}

class CarTest{
    static void changeDoorCount (Car c, int doorCount){
        c.doorCount = doorCount;
        System.out.println("Изменено количество дверей у объекта! ");
    }

    static void changeColor (Car c1, Car c2){
        /* Первый вариант
        Car c3 = new Car(null,null,0);
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;
         */
        // второй вариант без создания дополнительного объекта

        String color;
        color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Blue","v8",4);
        Car car2 = new Car("White", "V12",3);
        System.out.println("У объекта car1 сейчас дверей: " + car1.doorCount);
        changeDoorCount(car1, 10);
        System.out.println("У объекта car1 сейчас дверей: " + car1.doorCount);

        changeColor(car1,car2);
        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}
