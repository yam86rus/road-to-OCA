package Homework.Lesson16;

public class Lesson16 {
    //    ya@yahoo.com; on@mail.ru; ona@gmail.com
    //    yahoo
    //    mail
    //    gmail

//    мое решение
    public static void email(String str) {
        char c1;
        for (int i = 0; i < str.length(); i++) {
            c1 = str.charAt(i);
            if (c1 == '@') {
                int x = str.indexOf('.', i); // ищем ближайшую точку
                System.out.println(str.substring(i + 1, x));
            }
        }

    }

    //    решение в курсе
//    public static void email(String s) {
//        int a = 0; // позиция символа @
//        int b = 0; // позиция символа .
//        int c = 0; // позиция символа ;
//
//        while (c < s.length() - 1) {
//            a = s.indexOf('@', c);
//            b = s.indexOf('.', c);
//            c = s.indexOf(';', c + 1);
//            System.out.println(s.substring(a + 1, b));
//        }
//    }

}

class Lesson16Test {
    public static void main(String[] args) {

        Lesson16.email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}