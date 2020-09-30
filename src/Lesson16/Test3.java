package Lesson16;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";

        System.out.println(a + b + s); // сначала 5 + 6 = 11
        // если один из элементов String, то знак плюс будет расцениваться как знак конкатенации
        // т.е. получиться 11ок

        //если мы не хотим, чтобы 5 и 6 складывались, мы можем перед 5 написать пустой стринг ""
        System.out.println("" + a + b + s);
        System.out.println(a + "" + b + s); //или так
        System.out.println("" + (a + b) + s); //действие в скобках - выполниться первое
    }
}
