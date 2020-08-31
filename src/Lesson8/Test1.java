package Lesson8;

public class Test1 {
    public final int a;

    Test1() {
        a = 10;
    }

    Test1(boolean b) {
        a = 15;
    }

    public static void main(String[] args) {
        Test1 ex = new Test1();
        Test1 ex2 = new Test1(false);
        System.out.println(ex.a);
        System.out.println(ex2.a);
    }

    public void abc(final short s) {
        final byte b;
        b = 10;
//        s++;

        System.out.println(s + b);
    }
}
