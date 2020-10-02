package Lesson18;

import org.w3c.dom.ls.LSOutput;

public class Test5 {

    public static void main(String[] tigr) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4};
        int[] array2 = {1, 9, 3, -8, 0, 5, 4};
        int[] array3 = array2;

//        System.out.println(array2 == array3);
//        System.out.println(array3.equals(array2));
        array1[1] = 0;
        array2[5 - 3] = 3;
//        array1[array1.length]=10;//ArrayIndexOutOfBoundsException
        array1[array1.length - 1] = 10;


//    test. Какие объявления массива не корректны
        Car c1 = new Car("red", "v6");
        Car c2 = new Car("pink", "v8");
        Car c3 = new Car("blue", "v10");

        Car[] myCarArray = new Car[]{c1, c2, c3};
        for (int i = 0; i < myCarArray.length; i++) {
            System.out.println(myCarArray[i].color);
        }

        int[] arr = {1, 2, 3, 4};
        System.out.println(arr.length);
    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }


}
