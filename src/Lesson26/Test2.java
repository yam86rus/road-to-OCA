package Lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);

        Long l = 50L;
        // parseInt
        String s1 = "50";
//        String s1 = " 50"; пробел 50 не может быть интом
        String s2 = "true";
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        double d1 = Double.parseDouble(s3);
        System.out.println(i1);
        System.out.println(b1);
        System.out.println(d1);

    }
}
