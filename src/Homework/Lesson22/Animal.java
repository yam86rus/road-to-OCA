package Homework.Lesson22;

public class Animal {
    int eyes;

    Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("animal drinks");
    }
}


class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    Pet() {
        eyes = 2;
        System.out.println("I am pet");
    }

    void run() {
        System.out.println("pet runs");
    }

    void kump() {
        System.out.println("pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }

}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}


class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        System.out.println(dog1.paw);
        Cat cat1 = new Cat("Кыся");
        cat1.sleep();
    }
}