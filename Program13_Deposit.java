class BankAccount {
    double balance = 1000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    void deposit(double amount) {
        balance += amount + (amount * 0.05);
        System.out.println("Savings Balance with interest: " + balance);
    }
}

class CheckingAccount extends BankAccount {
    void deposit(double amount) {
        balance += amount;
        System.out.println("Checking Account Deposit Successful");
    }
}

public class Program13_Deposit {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(1000);

        CheckingAccount c = new CheckingAccount();
        c.deposit(500);
    }
}