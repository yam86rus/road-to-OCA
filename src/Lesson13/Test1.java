package Lesson13;

public class Test1 {

}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(5);
//        if (st1.grade == 2){
//            System.out.println("Студент двоечник");
//        } else if (st1.grade==3){
//            System.out.println("Студент троечник");
//        } else if (st1.grade == 4){
//            System.out.println("Студент хорошист");
//        } else if (st1.grade==5){
//            System.out.println("Студент отличник");
//        } else {
//            System.out.println("Оценка не верна!");
//        }
        switch (st1.grade) {
            case 2:
                System.out.println("Студен твоечник");
                break;
            case 3:
                System.out.println("Студент троечник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка не верна");
        }
    }
}
