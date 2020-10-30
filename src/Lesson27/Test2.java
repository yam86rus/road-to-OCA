package Lesson27;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {1, 4, 0};
        String s = null;
//        System.out.println(array[5]);//ArrayIndexOutOfBoundsException
//        System.out.println(s.length()); //NullPointerException
        System.out.println("Hello");
    }
}

class Test2_1 {
    void abc() throws NullPointerException { // предупреждение что данный метод может выбросить Exception
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        Test2_1 t2 = new Test2_1();
        try {

            t2.abc();
        } catch (NullPointerException e) {
            System.out.println("ups i did it again");
        }
    }
}
