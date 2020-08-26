package Homework.Lesson5;

public class Employe {
    Employe(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    double upSalary() {
        return salary *= 2;
    }
}

class EmployeTest {

    public static void main(String[] args) {
        Employe e1 = new Employe(1, "Yakushev", 35, 45000, "ОРКБ");
        Employe e2 = new Employe(2, "Ivanov", 29, 35000, "ОРКБ");

        e1.upSalary();
        e2.upSalary();
        System.out.println(e1.salary);
        System.out.println(e2.salary);

    }

}
