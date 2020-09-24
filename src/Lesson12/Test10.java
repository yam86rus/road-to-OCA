package Lesson12;

public class Test10 {
    public static void main(String[] args) {
        int salary = 3500;

//        if (salary >= 500) {
//            System.out.println(":)");
//        } else {
//            System.out.println(":(");
//        }

//             if (salary >= 500)
//            System.out.println(":)");
//        else
//            System.out.println(":(");

//        System.out.println("Все будет хорошо!");

//        if (salary<1000)
//            System.out.println("salary < 1000");
//        System.out.println("!!!");
//        else
//            System.out.println("salary > 1000");

        if (salary<1000){
            System.out.println("salary < 1000");
        } else if(salary < 2000){
            System.out.println("salary < 2000");
        } else if (salary < 3000) {
            System.out.println("salary < 3000");
        } else {
            System.out.println("salary > 3000");
        }
    }
}