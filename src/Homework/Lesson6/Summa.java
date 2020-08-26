package Homework.Lesson6;

public class Summa {
    int Sum() {
        int result = 0;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int Sum(int a) {
        int result = a;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int Sum(int a, int b) {
        int result = a + b;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int Sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int Sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int a, b, c, d;
}

class SummaTest {
    public static void main(String[] args) {
        Summa s1 = new Summa();
        s1.Sum(1, 1, 1, 1);
        s1.Sum(1, 1, 1);
        s1.Sum(1, 1);
        s1.Sum(1);
        s1.Sum();
    }
}