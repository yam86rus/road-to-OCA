package Homework.Lesson17;

public class Test1 {
//    мой метод

//    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
//        String s1 = new String(sb1);
//        String s2 = new String(sb2);
//
//        if(s1.equals(s2)){
//            return true;
//        } else {
//            return false;
//        }
//    }

    //    метод из курса
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {

            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("12345");
        StringBuilder sb2 = new StringBuilder("1234567");
        StringBuilder sb3 = new StringBuilder("1234567");

        System.out.println(ravenstvo(sb1, sb2));
        System.out.println(ravenstvo(sb2, sb3));
    }
}
