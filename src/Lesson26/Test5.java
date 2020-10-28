package Lesson26;

public class Test5 {
//    блок initialization block не задаю параметры и не указываю return type
//    срабатывает каждый раз когда создается новый объект класса
    // можно вызыват методы
    // в первую очередь срабатывает блок инициализации а потом конструктор


    public Test5() {
        System.out.println("Блок конструктор 1");
    }
    public Test5(int a) {
        this();
        System.out.println("Блок конструктор 2");
    }


    String s1;
    {
        s1 = "Блок инициализации 1";
        System.out.println(s1);
//        System.out.println("Hello");
//        int a = 5;
//        System.out.println(a);
    }
    static {
        System.out.println("Это static блок инициализации");
    }
    {
        System.out.println("Блок инициализации 2");
    }
    static {
        System.out.println("Это static блок инициализации 2");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5(3);
    }
}
