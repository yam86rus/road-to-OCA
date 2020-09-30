package Lesson17;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "privet";
        String s2 = "      "; // много пробелов
        String s3 = "           "; // много табов
        String s4 = "                   "; // много табов и пробелов
        String s5 = "                   а"; // много табов и пробелов и буква а
        String s6 = ""; //
        String s7 = "                           privet          ";
        System.out.println(s1.isBlank()); // false
        System.out.println(s2.isBlank()); // true
        System.out.println(s3.isBlank()); // true
        System.out.println(s4.isBlank()); // true
        System.out.println(s5.isBlank()); // false
        System.out.println(s6.isEmpty()); // true
        System.out.println(s6.isBlank()); // true
        System.out.println(s7);
        System.out.println(s7.trim());
        System.out.println(s7.strip());
        System.out.println(s7.stripLeading());
        System.out.println(s7.stripTrailing());


    }
}
