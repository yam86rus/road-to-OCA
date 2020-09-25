package Lesson13;

public class Employee {
    public static void main(String[] args) {

//        switch ("Суббота"){
//            case "Понедельник":
//                System.out.println("Работа до 18:00");
//                break;
//            case "Вторник":
//                System.out.println("Работа до 18:00");
//                break;
//            case "Среда":
//                System.out.println("Работа до 18:00");
//                break;
//            case "Четверг":
//                System.out.println("Работа до 18:00");
//                break;
//            case "Пятница":
//                System.out.println("Работа до 18:00");
//                break;
//            case "Суббота":
//                System.out.println("Работа до 14:00");
//                break;
//            case "Воскресение":
//                System.out.println("Работы нет");
//                break;
//            default:
//                System.out.println("Такого дня не существует");
//        }
//        String str = "Вторник";
//        switch (str){
//            case "Понедельник":
//            case "Вторник":
//            case "Среда":
//            case "Четверг":
//            case "Пятница":
//                System.out.println("Работа до 18:00");
//                break;
//            case "Суббота":
//                System.out.println("Работа до 14:00");
//                break;
//            case "Воскресение":
//                System.out.println("Работы нет");
//                break;
//            case " ":
//                System.out.println("Крутым парням пробелы не нужны )");
//                break;
//            default:
//                System.out.println("Такого дня не существует");
//        }
        int a = 1;
        final int с = 1;
        final int b = 2;
//        double day = 1; Нельзя тип данных boolean, float, double, referencies кроме String
//        switch (day){
        switch (3){
//            case a: Нельзя потому что int a может поменться.  Можно сделать из неё константу, тогда заработает
            case с:
            case b:
            case 3:
            case 4:
            case 5:
                System.out.println("Работа до 18:00");
                break;
            case 6:
                System.out.println("Работа до 14:00");
                break;
            case 7:
                System.out.println("Работы нет");
                break;
            default:
                System.out.println("Такого дня не существует");
        }


    }
}
