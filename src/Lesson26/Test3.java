package Lesson26;

public class Test3 {
    void abc (int i){
        System.out.println("int");
    }
    void abc (byte i){
        System.out.println("byte");
    }
    void abc (long i){
        System.out.println("long");
    }
    void ghi (int a, int b) {
        System.out.println("Hello 1");
    }
    void ghi (long a, long b) {
        System.out.println("Hello 2");
    }
    void ghi (Integer a, Integer b) {
        System.out.println("Hello 3");
    }
    void ghi (int ...a) {
        System.out.println("Hello 4");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(1); // by default int, потом long
        t.ghi(1,2); //1. Точное совпадение типов данных 2. Поглащающие типы данных 3. Autoboxed 3. varargs
    }
}
