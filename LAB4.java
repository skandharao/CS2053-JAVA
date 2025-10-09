abstract class Account {
    String accHolder;
    double balance;

    Account(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void display() {
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accHolder, double balance) {
        super(accHolder, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Savings Account Interest Added: ₹" + interest);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accHolder, double balance) {
        super(accHolder, balance);
    }

    void calculateInterest() {
        System.out.println("Current Account: No interest applied");
    }
}

public class LAB4 {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount("Riya", 10000);
        Account a2 = new CurrentAccount("Arjun", 20000);
        a1.calculateInterest();
        a1.display();
        a2.calculateInterest();
        a2.display();
    }
}
