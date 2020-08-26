package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info() {
        System.out.println("Имя: " + name + " Цвет машины: " + car.color + " Баланс: " + bA.balance);
    }
}


class Employe{
    String firstName;
    String lastName;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Марка машины:" + car.mark);
        System.out.println("Счет в банке: " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("Желтая", "V8",2019,"Mazda");
        h.bA = new BankAccount(1,500);
        h.info();

        Employe e1 = new Employe();
        e1.firstName = "Maksim";
        e1.lastName = "Yakushev";
        e1.car = new Car3("Белая", "v8", 2005,"Toyota");
        e1.bA = new BankAccount(2,2500);
        e1.info();
    }
}

class Car3 {

    Car3(String c, String e,int y, String m) {
        color = c;
        engine = e;
        yearCreate = y;
        mark = m;

    }

    String color;
    String engine;
    int yearCreate;
    String mark;
}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}
