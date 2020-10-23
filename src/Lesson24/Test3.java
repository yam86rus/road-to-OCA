package Lesson24;

public class Test3 {
}

class Employee {
    double salary = 100.00;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Кушать");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Teacher extends Employee implements Help_able {
    int kolichestvouchenikov;

    void uchit() {
        System.out.println("Учит");
    }

    public void pomosh() {
        System.out.println("Учитель помогает");
    }

    public void tushitpojar() {
        System.out.println("Учитель тушит пожар");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashiny;

    void vodit() {
        System.out.println("Водит");
    }

    public void pomosh() {
        System.out.println("Водитель помогает");
    }

    public void tushitpojar() {
        System.out.println("Водитель тушит пожар");
    }

    public void swim() {
        System.out.println("Водитель плавает");
    }
}

interface Help_able {
    void pomosh();

    void tushitpojar();
}

interface Swim_able {
    void swim();
}