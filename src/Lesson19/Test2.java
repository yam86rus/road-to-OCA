package Lesson19;

public class Test2 {
    static void summa(int a, int b) {
        System.out.println(a + b);
    }

    static void summa(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void summa(int... a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        System.out.println(result);
    }

    static void summa1(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        System.out.println(result);
    }

    static void abc(int a){
        System.out.println("Hello");
    }

    static void abc(int... a){
        System.out.println("By");
    }

    public static void main(String... args) {
        summa(10, 20, 30, 40);
        summa1(new int[]{1, 2, 3, 4, 100});
        abc();
    }
}
