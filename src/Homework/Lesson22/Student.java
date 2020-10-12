package Homework.Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 & course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 & grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo(){
        System.out.println("Имя: " + getName());
        System.out.println("Курс: " + getCourse());
        System.out.println("Средний бал: " + getGrade());
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Иван"));
        student.setCourse(4);
        student.setGrade(10);
        student.showInfo();
    }
}