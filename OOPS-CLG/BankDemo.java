abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 500.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into Savings Account. New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                if (amount <= WITHDRAWAL_LIMIT) {
                    balance -= amount;
                    System.out.println("Withdrew $" + amount + " from Savings Account. New balance: $" + balance);
                } else {
                    System.out.println("Withdrawal amount exceeds daily limit of $" + WITHDRAWAL_LIMIT + " for Savings Account.");
                }
            } else {
                System.out.println("Insufficient balance in Savings Account. Current balance: $" + balance);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 1000.0;

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into Current Account. New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance + OVERDRAFT_LIMIT >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " from Current Account. New balance: $" + balance);
            } else {
                System.out.println("Withdrawal amount exceeds overdraft limit for Current Account. Current balance: $" + balance + ", Overdraft limit: $" + OVERDRAFT_LIMIT);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        System.out.println("--- Savings Account Operations ---");
        SavingsAccount savings = new SavingsAccount(1000.0);
        savings.deposit(200.0);
        savings.withdraw(150.0);
        savings.withdraw(600.0);
        savings.withdraw(1000.0);
        System.out.println("Savings Account final balance: $" + savings.getBalance());

        System.out.println("\n--- Current Account Operations ---");
        CurrentAccount current = new CurrentAccount(500.0);
        current.deposit(300.0);
        current.withdraw(700.0);
        current.withdraw(1200.0);
        current.withdraw(100.0);
        System.out.println("Current Account final balance: $" + current.getBalance());
    }
}
