package Lesson9;

public class Car {
    int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 5;
    int _Gkjhkjhj = 3;
    int CLASS = 5;
    int String = 4;
    final int XYZ = 6;

    String color;
    String engine;
    static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

//    public void showColor() {
//        System.out.println("Цвет машины был: " + color);
//        changeColor("золото");
//        System.out.println("Цвет машины стал: " + color);
//    }
//
//    public void changeColor(String color) {
//        System.out.println("Цвет машины изменился");
//        this.color = color;
//        int price = 5000;
//        price += 1000;
//    }
//    void abc(int a, int b){
//        boolean c = true;
//    }
//    void abcd(int a, int b){
//        boolean c = true;
//
//    }

    void changeColor(String color){
        this.color = color;
    }

}

class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "V12");
        System.out.println(car.color);
        car.changeColor("black");
        System.out.println(car.color);
    }
}
