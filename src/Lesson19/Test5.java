package Lesson19;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Иванов", "Петров", "Сидоров"};
        String[] exams = {"Математика", "Философия"};
        for (String s:students){
            for (String e: exams){
                System.out.println(s + " " + e);
            }
        }

    }
}
