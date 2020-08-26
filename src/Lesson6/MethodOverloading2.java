package Lesson6;

public class MethodOverloading2 {
    int sum(int i1, int i2) {
        return i1 + i2;
    }
    String sum(String s1, String s2){
        return s1+s2;
    }
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 m1 = new MethodOverloading2();
        int a = m1.sum(5,7);
        System.out.println(a);
        String s = m1.sum("Привет, ", "мой друг");
        System.out.println(s);
    }
}