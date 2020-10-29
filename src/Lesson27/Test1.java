package Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}

class Animal {
    int a = 5;
    static int b = 10;

    void abc() {
        System.out.println("non-static метод класса Animal");
    }

    static void def() {
        System.out.println("static метод класса Animal");
    }
}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;

    void abc() {
        System.out.println("non-static метод класса Tiger");
    }

    static void def() {
        System.out.println("static метод класса Tiger");
    }
}
