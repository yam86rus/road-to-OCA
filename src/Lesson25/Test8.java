package Lesson25;

public class Test8 {
}

class Test10 implements interface1, interface2 {
    @Override
    public void abc() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        ((interface1) t).abc();
        t.abc();
        System.out.println(((interface2)t).a);
    }
}


interface interface1 {
    int a = 5;

    void abc();
}

interface interface2 {
    int a = 10;

    void abc();
}
