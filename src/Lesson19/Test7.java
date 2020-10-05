package Lesson19;

public class Test7 {
    public static void main(String[] args) {
//        int[] array = {0, 6, 4, 1};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 3;
//        }
//
//        for(int a: array){
//            a = 31337;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        StringBuilder sb1 = new StringBuilder("Privet");
        StringBuilder sb2 = new StringBuilder("Poka");
        StringBuilder sb3 = new StringBuilder("Ok");
        StringBuilder[] array = {sb1, sb2, sb3};
        for (StringBuilder sb : array) {
            sb = new StringBuilder("Вииииууу");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
