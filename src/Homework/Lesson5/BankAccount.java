package Homework.Lesson5;

public class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;

    double poplnenieScheta(double summa) {
        balance += summa;
        System.out.println("Пополнение баланса на " + summa);
        return balance;
    }

    double snyatieSoScheta(double summa) {
        balance -= summa;
        System.out.println("Снятие со счета " + summa);
        return balance;
    }

}

class BankTest {

    public static void main(String[] args) {

        BankAccount bA1 = new BankAccount(1, 1000);
        System.out.println(bA1.id);
        System.out.println(bA1.balance);
        bA1.poplnenieScheta(150);
        System.out.println(bA1.balance);
        bA1.snyatieSoScheta(500);
        System.out.println(bA1.balance);
    }

}
