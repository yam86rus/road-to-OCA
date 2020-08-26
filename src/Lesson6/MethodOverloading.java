package Lesson6;

public class MethodOverloading {
    void show(int i) {
        System.out.println(i);
    }
    void show(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    void show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
    }

    void show (String s, int a) {
        System.out.println("String: " + s + " int :" + a);
    }
    void show (int a, String s) {
        System.out.println("какой хороший день");
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        int a = 500;
        m1.show(a);
        boolean b = true;
        m1.show(b);
        String s = "Строка";
        m1.show(s);
        m1.show("привет", 10);
        m1.show(10,"Привет");
    }
}