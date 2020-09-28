package Lesson14;

public class Test5 {
    //    loop statments
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            if (i == 7) {
//                break;
//            }
//            System.out.println(i);
//        }
//        loop continue. Выведет цифры с 0 до 100, кроме 87
//        for (int i = 0; i <= 100; i++) {
//            if (i == 87) {
//                continue;
//            }
//            System.out.println(i);
//        }

        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }

            if (i % 55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
