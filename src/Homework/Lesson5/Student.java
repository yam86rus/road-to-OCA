package Homework.Lesson5;

public class Student {
    int StudentId;
    String firstName;
    String lastName;
    int year;
    double avrMathematic;
    double avrEconomic;
    double avrEnglish;

    double abc (){
        double result = (avrMathematic + avrEconomic + avrEnglish) /3;
        return result;
    }

}

class StudentTest {

    double srednyaArifmOcenka (Student sred){
        double result = (sred.avrMathematic + sred.avrEnglish + sred.avrEconomic) /3;
        return result;
    }

    double zzz (Student sred){
        double result = sred.abc();
        return result;
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.StudentId = 1;
        student1.firstName = "Maksim";
        student1.lastName = "Yakushev";
        student1.year = 2002;
        student1.avrMathematic = 4.8;
        student1.avrEconomic = 4.5;
        student1.avrEnglish = 5;

        Student student2 = new Student();
        student2.StudentId = 2;
        student2.firstName = "Olesia";
        student2.lastName = "Yakusheva";
        student2.year = 2002;
        student2.avrMathematic = 4.4;
        student2.avrEconomic = 5;
        student2.avrEnglish = 4.2;

        Student student3 = new Student();
        student3.StudentId = 3;
        student3.firstName = "Dmitri";
        student3.lastName = "Yakushev";
        student3.year = 2003;
        student3.avrMathematic = 4;
        student3.avrEconomic = 3;
        student3.avrEnglish = 4;

        StudentTest st = new StudentTest();

        System.out.println("Номер студенческого билета: " + student1.StudentId);
        System.out.println("Имя " + student1.firstName);
        System.out.println("Фамилия " + student1.lastName);
        System.out.println("Год поступления " + student1.year);
        System.out.println("Средняя оценка по матиматике " + student1.avrMathematic);
        System.out.println("Средняя оценка по экономике " + student1.avrEconomic);
        System.out.println("Средняя оценка по Английскому языку " + student1.avrEnglish);
        System.out.println("Общая средняя оценка по всем трем предметам " + st.srednyaArifmOcenka(student1));
        System.out.println("Второй вариант вызова средней оценки по трем предметам: " + student1.abc());
        System.out.println("Третий вариант вызова средней оценки по трем предметам " + st.zzz(student1));
        System.out.println("---");

        System.out.println("Номер студенческого билета: " + student2.StudentId);
        System.out.println("Имя " + student2.firstName);
        System.out.println("Фамилия " + student2.lastName);
        System.out.println("Год поступления " + student2.year);
        System.out.println("Средняя оценка по матиматике " + student2.avrMathematic);
        System.out.println("Средняя оценка по экономике " + student2.avrEconomic);
        System.out.println("Средняя оценка по Английскому языку " + student2.avrEnglish);
        System.out.println("Общая средняя оценка по всем трем предметам " + st.srednyaArifmOcenka(student2));
        System.out.println("Второй вариант вызова средней оценки по трем предметам: " + student2.abc());
        System.out.println("Третий вариант вызова средней оценки по трем предметам " + st.zzz(student2));
        System.out.println("---");

        System.out.println("Номер студенческого билета: " + student3.StudentId);
        System.out.println("Имя " + student3.firstName);
        System.out.println("Фамилия " + student3.lastName);
        System.out.println("Год поступления " + student3.year);
        System.out.println("Средняя оценка по матиматике " + student3.avrMathematic);
        System.out.println("Средняя оценка по экономике " + student3.avrEconomic);
        System.out.println("Средняя оценка по Английскому языку " + student3.avrEnglish);
        System.out.println("Общая средняя оценка по всем трем предметам " + st.srednyaArifmOcenka(student3));
        System.out.println("Второй вариант вызова средней оценки по трем предметам: " + student3.abc());
        System.out.println("Третий вариант вызова средней оценки по трем предметам " + st.zzz(student3));
        System.out.println("---");

    }
}