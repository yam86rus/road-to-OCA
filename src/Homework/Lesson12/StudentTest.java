package Homework.Lesson12;

import Lesson11.Student;

public class StudentTest {

    public void checkStudentSimple(Student student1, Student student2) {
        if (student1.name.equals(student2.name) && student1.course == student2.course && student1.grade == student2.grade) {
            System.out.println("Студенты совпадают");
        } else {
            System.out.println("Студенты разные");
        }
    }

    public void checkStudentFull(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
//            System.out.println("имена совпадают");
            if (st1.course == st2.course) {
//                System.out.println("Курсы совпадают");
                if (st1.grade == st2.grade) {
//                    System.out.println("Оценки совпадают");
                    System.out.println("Студенты совпадают");
                } else {
                    System.out.println("Оценки не совпадают");
                }
            } else {
                System.out.println("Курсы не совпадают");
            }
        } else {
            System.out.println("Имена не совпадают");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,9.7);
        Student st2 = new Student("Ivan",3,9.7);
        Student st3 = new Student("Olga",3,9.7);
        Student st4 = new Student("Olga",2,9.7);
        Student st5 = new Student("Olga",2,9.6);

        StudentTest test = new StudentTest();

        test.checkStudentSimple(st1, st2);
        test.checkStudentSimple(st1, st3);
        System.out.println("-----------");
        test.checkStudentFull(st1,st2);
        test.checkStudentFull(st2,st3);
        test.checkStudentFull(st3,st4);
        test.checkStudentFull(st4,st5);

    }
}