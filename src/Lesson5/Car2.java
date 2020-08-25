package Lesson5;

public class Car2 {


    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormos(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Цвет: " + color + " Мотор: " + engine + " Скорость: " + speed);
    }

}

class Car2Test {
    public static void main(String[] args) {

    }
}