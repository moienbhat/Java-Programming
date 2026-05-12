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
        System.out.println("Balance: " + balance);
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
        }
    }
}

class FixedDepositAccount extends SavingsAccount {
    int term;

    FixedDepositAccount(int acc, double bal, double rate, double min, int term) {
        super(acc, bal, rate, min);
        this.term = term;
    }

    double getInterest() {
        return (balance * interestRate * term) / 100;
    }
}

public class Program9_FixedDeposit {
    public static void main(String[] args) {
        FixedDepositAccount f = new FixedDepositAccount(101, 10000, 5, 2000, 2);
        f.deposit(2000);
        System.out.println("Interest: " + f.getInterest());
    }
}