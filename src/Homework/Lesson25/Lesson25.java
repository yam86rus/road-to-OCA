package Homework.Lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Меченосец");
        Animal a2 = new Pingvin("Пингвин");
        Animal a3 = new Lev("Лев");
        Fish f1 = new Mechenosec("Меченосец2");
        Bird b1 = new Pingvin("Пингвин2");
        Mammal m1 = new Lev("Лев2");
        Mechenosec mech1 = new Mechenosec("Меченосец 2");
        Pingvin p1 = new Pingvin("Пингвин 2");
        Lev l1 = new Lev("Лев3");
        Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};

        Speakable s1 = new Pingvin("Пингвин 3");
        Speakable s2 = new Lev("Лев 3");

        Speakable[] array2 = {s1, s2, b1, m1, p1, l1};
        for (Animal a : array1) {
            if(a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec)a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            }
        }
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

