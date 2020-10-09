package Lesson21;

public class Test2_1 {
    private String firstName;
    private String lastName;
    private String surName;
    private String department;

    Test2_1(String firstName, String lastName, String surName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.department = department;
    }
    Test2_1(String lastName,String surName){
        this(null,lastName,surName,null);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void showInfo(Test2_1 t){
        System.out.println(t.firstName);
        System.out.println(t.lastName);
        System.out.println(t.surName);
        System.out.println(t.department);
        System.out.println("Вывод завершен");
    }
}

class Test2_2{
    public static void main(String[] args) {
        Test2_1 t1 = new Test2_1("Якушев", "Юрьевич");
        t1.setFirstName("Максим");

        Test2_1.showInfo(t1);
    }
}
