interface Loan {
    void calculateEMI(double amount, int years);
}

class HomeLoan implements Loan {
    public void calculateEMI(double amount, int years) {
        double rate = 7.5;
        double emi = (amount * rate * years) / 100;
        System.out.println("Home Loan EMI: ₹" + emi);
    }
}

class CarLoan implements Loan {
    public void calculateEMI(double amount, int years) {
        double rate = 9.0;
        double emi = (amount * rate * years) / 100;
        System.out.println("Car Loan EMI: ₹" + emi);
    }
}

public class LAB5 {
    public static void main(String[] args) {
        Loan l1 = new HomeLoan();
        Loan l2 = new CarLoan();
        l1.calculateEMI(500000, 10);
        l2.calculateEMI(300000, 5);
    }
}
