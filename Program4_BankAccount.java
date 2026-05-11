class BankAccount {
    int accountNumber;
    double balance;
    double interestRate;

    BankAccount(int accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double minimumBalance;

    SavingsAccount(int accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    void withdraw(double amount) {
        if(balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Minimum balance limit reached");
        }
    }
}

public class Program4_BankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, 5000, 5);
        b.deposit(1000);

        SavingsAccount s = new SavingsAccount(102, 10000, 6, 2000);
        s.deposit(2000);
        s.withdraw(5000);
    }
}