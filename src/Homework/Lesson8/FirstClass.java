package Homework.Lesson8;

public class FirstClass {
    public final static double PI = 3.14;

    // Площадь круга
    public double areaOfCircle(int r) {
        return PI * r * r;
    }

    // Длинна окружности
    public static double lengthOfCircle(int r) {
        return 2 * PI * r;
    }
    // Произведение трех чисел
    public static int abc(int a, int b, int c) {
        return a * b * c;
    }
    // Информация о делении одного числа на другое
    public static void def(int a, int b) {
        System.out.println("Целое от деления числа " + a + " на число " + b + " равно: " + a / b);
        System.out.println("Остаток от деления числа " + a + " на число " + b + " равно: " + a % b);
    }
    // Вывод информации по радиусу
    public void showInfo(int r) {
        System.out.println("Радиус: " + r);
        System.out.println("Площадь круга: " + areaOfCircle(r));
        System.out.println("Длина окружности: " + lengthOfCircle(r));
    }
}

class FirstClassTest {
    public static void main(String[] args) {
        System.out.println(FirstClass.abc(2, 3, 4));
        System.out.println(FirstClass.abc(4, 5, 6));
        FirstClass.def(6, 3);
        FirstClass.def(12, 2);

        FirstClass item1 = new FirstClass();
        item1.showInfo(3);
        item1.showInfo(6);


    }
}
