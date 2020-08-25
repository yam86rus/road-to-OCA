package Homework.Lesson4;

public class Student {
    int StudentId;
    String firstName;
    String lastName;
    int year;
    double avrMathematic;
    double avrEconomic;
    double avrEnglish;
    double avrAll;
}

class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.StudentId = 1;
        student1.firstName = "Maksim";
        student1.lastName = "Yakushev";
        student1.year = 2002;
        student1.avrMathematic = 4.8;
        student1.avrEconomic = 4.5;
        student1.avrEnglish = 5;
        student1.avrAll = (student1.avrEconomic + student1.avrEnglish + student1.avrMathematic)/3;

        Student student2 = new Student();
        student2.StudentId = 2;
        student2.firstName = "Olesia";
        student2.lastName = "Yakusheva";
        student2.year = 2002;
        student2.avrMathematic = 4.4;
        student2.avrEconomic = 5;
        student2.avrEnglish = 4.2;
        student2.avrAll = (student2.avrEconomic + student2.avrEnglish + student2.avrMathematic)/3;

        Student student3 = new Student();
        student3.StudentId = 3;
        student3.firstName = "Dmitri";
        student3.lastName = "Yakushev";
        student3.year = 2003;
        student3.avrMathematic = 4;
        student3.avrEconomic = 3;
        student3.avrEnglish = 4;
        student3.avrAll = (student3.avrEconomic + student3.avrEnglish + student3.avrMathematic)/3;

        System.out.println("Номер студенческого билета: " + student1.StudentId);
        System.out.println("Имя " + student1.firstName);
        System.out.println("Фамилия " + student1.lastName);
        System.out.println("Год поступления " + student1.year);
        System.out.println("Средняя оценка по матиматике " + student1.avrMathematic);
        System.out.println("Средняя оценка по экономике " + student1.avrEconomic);
        System.out.println("Средняя оценка по Английскому языку " + student1.avrEnglish);
        System.out.println("Общая средняя оценка по всем предметам " + student1.avrAll);
        System.out.println("---");

        System.out.println("Номер студенческого билета: " + student2.StudentId);
        System.out.println("Имя " + student2.firstName);
        System.out.println("Фамилия " + student2.lastName);
        System.out.println("Год поступления " + student2.year);
        System.out.println("Средняя оценка по матиматике " + student2.avrMathematic);
        System.out.println("Средняя оценка по экономике " + student2.avrEconomic);
        System.out.println("Средняя оценка по Английскому языку " + student2.avrEnglish);
        System.out.println("Общая средняя оценка по всем предметам " + student2.avrAll);
        System.out.println("---");

        System.out.println("Номер студенческого билета: " + student3.StudentId);
        System.out.println("Имя " + student3.firstName);
        System.out.println("Фамилия " + student3.lastName);
        System.out.println("Год поступления " + student3.year);
        System.out.println("Средняя оценка по матиматике " + student3.avrMathematic);
        System.out.println("Средняя оценка по экономике " + student3.avrEconomic);
        System.out.println("Средняя оценка по Английскому языку " + student3.avrEnglish);
        System.out.println("Общая средняя оценка по всем предметам " + student3.avrAll);
        System.out.println("---");
    }
}
