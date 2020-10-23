package Lesson24;

public class Test4 {
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

class Human implements Jumpable {
    @Override
    public void jump() {
        System.out.println("Human jump");
    }
}

class Animal implements Jumpable {
    @Override
    public void jump() {
        System.out.println("Animal jump");
    }
}

interface Jumpable {
    void jump();
}