package Homework.Lesson13;

public class Month {
    static void showNumbersOfMonth(int i){
        switch (i){
            case 1:
                System.out.println("В Январе 2015 года 31 день");
                break;
            case 2:
                System.out.println("В Феврале 2015 года 28 дней");
                break;
            case 3:
                System.out.println("В Марте 2015 года 31 день");
                break;
            case 4:
                System.out.println("В Апреле 2015 года 30 дней");
                break;
            case 5:
                System.out.println("В Мае 2015 года 31 день");
                break;
            case 6:
                System.out.println("В Июне 2015 года 30 дней");
                break;
            case 7:
                System.out.println("В Июле 2015 года 31 день");
                break;
            case 8:
                System.out.println("В Августе 2015 года 31 день");
                break;
            case 9:
                System.out.println("В Сентябре 2015 года 30 дней");
                break;
            case 10:
                System.out.println("В Октябре 2015 года 31 день");
                break;
            case 11:
                System.out.println("В Ноябре 2015 года 3 дней");
                break;
            case 12:
                System.out.println("В Декабре 2015 года 31 день");
                break;
            default:
                System.out.println("Месяц с таким порядковым номером не существует");
        }
    }
}

class MonthTest{
    public static void main(String[] args) {
        Month.showNumbersOfMonth(1);
        Month.showNumbersOfMonth(3);
        Month.showNumbersOfMonth(5);
        Month.showNumbersOfMonth(12);
        Month.showNumbersOfMonth(0);
    }
}