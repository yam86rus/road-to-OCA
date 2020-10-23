package Lesson24;

public class Test5 {
}

interface I1 {
    void abc();

    default void def() {
        System.out.println("Это метод default");
    }
}

interface I2 extends I1 {
    void def();
}

class Z2 implements I1{
    @Override
    public void abc() {
        System.out.println("Это метод ABC");
    }

}
