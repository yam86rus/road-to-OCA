package Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Студент номер: " + count + " создан");
    }

    public static void showCount() {
        System.out.println("Всего созданно студентов: " + count);
    }


    public void showInfo() {
        System.out.println("Welcome to the student class");
    }

    public static void main(String[] args) {

    }


}

//class StudentTest {
//    public static void main(String[] args) {
//
//            Student.showCount();
//            Student.count++;
//            Student.showCount();
//        Student st1 = new Student("Ivan", 1);
//        Student st2 = new Student("Olga", 1);
//        Student st3 = new Student("Petr", 1);
//
//        System.out.println(st2.name);
//        System.out.println(Student.count);
//
//    }
//}
