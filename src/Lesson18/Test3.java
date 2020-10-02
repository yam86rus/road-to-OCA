package Lesson18;

public class Test3 {
    static String s;
    public static void main(String[] args) {
//        int [] array = new int[-3]; // NegativeArraySizeException
        int [] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
//        array1[3] = 4; // ArrayIndexOutOfBoundsException
        int [][] array2 = new int[3][];
//        System.out.println(array2[0][0]); // NullPointerException
        System.out.println(s.length()); // NullPointerException
    }
}
