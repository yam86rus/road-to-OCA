package Lesson14;

public class Test3 {
//    static int numberChet (int a, int b){
//        int number = 0;
//        for (;a<=b;a+=2){
//            number++;
//        }
//        return number;
//    }


    public static void main(String[] args) {
//        for (int i = 0; i <= 30; i+=2) {
//            System.out.println(i);
//        }
//        for (int i = 0; false; i++) { // Ошибка копилятора java: unreachable statement
//            System.out.println(i);
//        }
        for (int i = 2; i <= 30; i += 2) {
            System.out.println(i);
        }
        int j = 10;

        if (true){
            System.out.println("Меньше трех");
        }
        if (false){ // исключение java: unreachable statement
            System.out.println("Меньше трех");
        }
    }
}
