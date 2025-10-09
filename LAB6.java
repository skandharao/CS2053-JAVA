class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance for withdrawal");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: ₹" + balance);
        }
    }
}

public class LAB6 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Aarav", 5000);
        try {
            acc.withdraw(7000);
        } catch (LowBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
