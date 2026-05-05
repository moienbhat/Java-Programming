class BankAccount {
    int accountNumber;
    double balance;
    double transactionLimit;

    BankAccount(int accountNumber, double balance, double transactionLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    void deposit(double amount) {
        if (amount > transactionLimit) {
            System.out.println("Deposit exceeds transaction limit");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void withdraw(double amount) {
        if (amount > transactionLimit) {
            System.out.println("Withdrawal exceeds transaction limit");
        } else if (amount > balance) {
            System.out.println("Insufficient balance, penalty applied");
            balance -= 100;
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void addMonthlyInterest() {
        double interest = 0.04 * balance;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, 5000, 2000);

        b.deposit(1500);
        b.withdraw(6000);
        b.withdraw(1000);
        b.addMonthlyInterest();
        b.display();
    }
}