package Homework.Lesson5;

public class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;

    double poplnenieScheta (double summa){
        double result = balance + summa;
        return result;
    }

    double snyatieSoScheta (double summa){
        double result = balance - summa;
        return result;
    }

}
