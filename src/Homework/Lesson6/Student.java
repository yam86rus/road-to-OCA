package Homework.Lesson6;

public class Student {
    Student(int studentId2, String firstName2, String lastName2, int year2, double avrMathematic2, double avrEconomic2, double avrEnglish2) {
        studentId = studentId2;
        firstName = firstName2;
        lastName = lastName2;
        year = year2;
        avrMathematic = avrMathematic2;
        avrEconomic = avrEconomic2;
        avrEnglish = avrEnglish2;
    }
    Student(int studentId2, String firstName2, String lastName2, int year2){
        this(studentId2, firstName2, lastName2, year2,0.0,0.0,0.0);
    }
    Student(){
    }

    void info(){
        System.out.println(studentId + " " + firstName + " " + lastName + " "+ year + " "+ avrMathematic + " " + avrEconomic + " " + avrEnglish);
    }

    int studentId;
    String firstName;
    String lastName;
    int year;
    double avrMathematic;
    double avrEconomic;
    double avrEnglish;
}

class StudentTest{
    String newInfo(Student s){
        String result = s.studentId + " " + s.firstName + " " + s.lastName + " " + s.year;
        return result;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Maksim","Yakushev",2002,4.5,4.5,5);
        s1.info();
        StudentTest st1 = new StudentTest();
        System.out.println(st1.newInfo(s1)); // Опа ганга стайл )

        Student s2 = new Student(2, "Olesia", "Yakusheva", 2003);
        s2.info();
        Student s3 = new Student();
        s3.info();
    }
}