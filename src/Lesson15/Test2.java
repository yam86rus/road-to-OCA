package Lesson15;

public class Test2 {
    public static void main(String[] args) {
        int money = 100;

        while (money > 0) {
            System.out.println("Делайте ставку");
            int randon = 1 + (int) (Math.random() * 10);
            System.out.println("Вы поставили: " + randon);
            money -= randon;

            System.out.println("Вы проирали, у Вас осталось: " + money);
        }
    }
}
