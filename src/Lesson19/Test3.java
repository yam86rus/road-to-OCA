package Lesson19;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {0,6,4,1};
        String[] name = {"Иванов", "Петров", "Сидоров", "Губанов", "Исанов", };
//        for (int i = 0; i<array.length; i++){
//            System.out.print(array[i] + " ");
////        }
//        for(int a:array){
//            System.out.print(a + " ");
//        }

        for(String name1: name){
            System.out.println(name1);
        }
    }
}
