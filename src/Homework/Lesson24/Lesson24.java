package Homework.Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Меченосец-Вася");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        System.out.println();

        Speakable pingvin = new Pingvin("Пингвин - Жора");
        pingvin.speak();

        System.out.println();

        Animal lev = new Lev("Лев - Марти");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();

        System.out.println();

        Mammal lev2 = new Lev("Еще один лев");
        System.out.println(lev2.name);
        lev2.run();
        lev2.eat();
        lev2.sleep();
        lev2.speak();
    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();

}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы!");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Some body speaks");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает!");
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищная рыба, и она ест обычный рыбый корм!");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу!");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят, прижавшись друг к другу");
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь, как соловьи!");
    }
}

class Lev extends Mammal {

    Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Лев, как любой хищник, любит мясо!");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("Лев это не самая быстрая кошка");
    }
}


