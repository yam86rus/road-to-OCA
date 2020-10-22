package Lesson24;

public class Test1 {
    public final static void main(String[] args) {
        System.out.println("привет");
    }
}

class A {
    String a = "privet";

    void abc() {
        System.out.println("???");
    }
}

class B extends A {
    String a = "poka";

    void abc() {
        System.out.println("!!!");
    }
}

class C extends B {
    public static void main(String[] args) {
        C c = new C();
        c.abc();
        System.out.println(c.a);
    }
}
