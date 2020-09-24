package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel (double a){
        return a *=2;
    }

    public double zp2 (){
        return salary *=2;
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee("Maxim", 100.55);
        System.out.println(e1.uvelichitel(e1.salary));
        System.out.println(e1.salary);
        e1.zp2();
        System.out.println(e1.salary);
    }
}
