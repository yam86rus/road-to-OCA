package Lesson4;

public class BankAccount {
    int id = 10;
    String name = "Petr";
    double balance = 100;
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        BankAccount MyAccount2 = MyAccount;

        MyAccount.id = 1;
        MyAccount.name = "Zaur";
        MyAccount.balance = 15;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 30.35;

//        HisAccount.id = 3;
//        HisAccount.name = "Ivan";
//        HisAccount.balance = 125.5;

        System.out.println(MyAccount.id);
        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balance);

        System.out.println("MyAccount2 " + MyAccount2.id);
        System.out.println("MyAccount2 " + MyAccount2.name);
        System.out.println("MyAccount2 " + MyAccount2.balance);
    }
}