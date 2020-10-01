package Lesson17;

import org.w3c.dom.ls.LSOutput;

class Car {
}

public class Test1 {
    // Крутым парням пробелы ни к чему. кривой какой-то
    public static StringBuilder deleteSpace(StringBuilder sb1) {
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) == ' ') {
                sb1.deleteCharAt(i);
            }
        }
        return sb1;
    }


    public static void main(String[] args) {
//        String s1 = "privet";
//        String s2 = "      "; // много пробелов
//        String s3 = "           "; // много табов
//        String s4 = "                   "; // много табов и пробелов
//        String s5 = "                   а"; // много табов и пробелов и буква а
//        String s6 = ""; //
//        String s7 = "                           privet          ";
//        System.out.println(s1.isBlank()); // false
//        System.out.println(s2.isBlank()); // true
//        System.out.println(s3.isBlank()); // true
//        System.out.println(s4.isBlank()); // true
//        System.out.println(s5.isBlank()); // false
//        System.out.println(s6.isEmpty()); // true
//        System.out.println(s6.isBlank()); // true
//        System.out.println(s7);
//        System.out.println(s7.trim());
//        System.out.println(s7.strip());
//        System.out.println(s7.stripLeading());
//        System.out.println(s7.stripTrailing());

        StringBuilder sb1 = new StringBuilder(); // default capacity 16 символов
        StringBuilder sb2 = new StringBuilder("Dood day!!!");
        StringBuilder sb3 = new StringBuilder(50); // capacity - вместимость. Вместимость 50 символов
        StringBuilder sb4 = new StringBuilder(sb2); // можем в параметре использовать сам StringBuilder
        StringBuilder sb5 = new StringBuilder("Объект класса StringBuilder");
//        System.out.println(sb2.length());
//        System.out.println(sb3.length()); // 0 - потому что постой
//        System.out.println(sb2.charAt(6)); // возвращает char указанного int
//        System.out.println(sb2.indexOf("o", 2));
//        String s = sb2.substring(5); // day!!!
//        String s = sb2.substring(5, 8); // day
//        System.out.println(sb2.subSequence(0,9));

//        sb2.append(22);
//        System.out.println(sb2);
//
//        sb2.append(true);
//        System.out.println(sb2);
//
//        sb2.append(sb2);
//        System.out.println(sb2);
//
//        sb2.append("HELLO");
//        System.out.println(sb2);
//
//        sb2.append(sb2);
//        System.out.println(sb2);
//
//        sb2.append(new Car());
//        System.out.println(sb2);

//        sb5.insert(sb5.length(),"FIN");
//        System.out.println(sb5);

//        sb5.insert(sb5.length()+1,"FIN"); // exeption StringIndexOutOfBoundsException
//        sb5.insert(sb5.length(), "FIN");
//        System.out.println(sb5);

//        sb5.delete(sb5.length() - 17, sb5.length());
//        System.out.println(sb5);

//        sb5.append(" " + sb5);
//        StringBuilder sb6 = new StringBuilder("Текс           в  котором очень     много    лишних    пробелов");
//        sb5.deleteCharAt(5); // удаляем 5-й символ с начала
//        System.out.println(sb5);
//        deleteSpace(sb6);
//        System.out.println(sb6);

//        StringBuilder sb7 = new StringBuilder("казак");
//        StringBuilder sb8 = new StringBuilder("казачка");
//        System.out.println(sb7);
//        System.out.println(sb7.reverse());


//        StringBuilder sb12 = new StringBuilder("Всем привет");
//        sb12.replace(0, 4, "Петя,");
//        System.out.println(sb12);
//        isPalindrom(sb7);
//        isPalindrom(sb8);
//        sb7.reverse();
//        System.out.println(sb7);


//        StringBuilder sb13 = new StringBuilder();
//        System.out.println(sb13.capacity());

        StringBuilder sb14 = new StringBuilder("ABCD");
        System.out.println(sb14.capacity());

    }
}
