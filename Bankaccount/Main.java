package Bankaccount;
public class Main {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountNumber(12345);

        b.deposit(10000);

        b.withdraw(2000);

        System.out.println("\nBank Account Details");
        b.display();
    }
}