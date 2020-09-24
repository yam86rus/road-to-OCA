package Lesson11;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student (String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void changeName (Student s){
        s.name = "Вжик";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2020, 9.8);
        Student st2 = new Student("Maria", 2019, 9.9);

        st1.setName("New Ivan");
        System.out.println(st1.name);
        changeName(st1);
        System.out.println(st1.name);

    }
}
