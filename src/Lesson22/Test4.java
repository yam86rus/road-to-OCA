package Lesson22;

import Lesson11.Student;

public class Test4 {
}

class Human2 {
    String name;
    String surname;

    Human2(String name, String surname) {
    this.name = name;
    this.surname = surname;
    }
    Human2(String name){
        this(name, null);
    }
}

class Student2 extends Human2{
    Student2(){
        super("Petya");
    }
    public static void main(String[] args) {
        Student2 s2 = new Student2();
    }
}


