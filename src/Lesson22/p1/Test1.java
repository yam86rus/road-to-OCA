package Lesson22.p1;
import Lesson22.Chelovek;

public class Test1 {
    public static void main(String[] args) {
        Chelovek c1 = new Chelovek("male");
        c1.setName("Паша");
        c1.getName().concat("!!!");
        c1.setVes(88);
        System.out.println("Имя: " + c1.getName());
        System.out.println("Вес: " + c1.getVes());
    }
}
