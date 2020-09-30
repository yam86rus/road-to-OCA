package Lesson16;

public class Test2 {

    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcd");
        String s3 = new String("   some text to trim   ");

//        String str1 = s2.substring(3);
//        System.out.println(str1);
//
//        String str2 = s2.substring(3,6);
//        System.out.println(str2);
//
//        String str3 = s3.trim(); // убирает пробелы вначале и в конце
//        System.out.println(str3);

//        String str4 = s1.replace('p','Z'); // замена char
////        System.out.println(str4);

//        String str5 = s1.replace("vet", "vivka"); // замена String
//        System.out.println(str5);

//        String str6 = "poka";
//        String str7 = str6.replace("k","k");
//        System.out.println(str6 == str7); // false

//        String str6 = "poka";
//        String str7 = str6.replace('k','k'); // замена через Char
//        System.out.println(str6 == str7); // true

        String str7 = "some text";
//        String str8 = "new"; //второй вариант через +
        String str8 = str7.concat(" new");
        System.out.println(str7+str8);
//        System.out.println(str8);


    }
}
