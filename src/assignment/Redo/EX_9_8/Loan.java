package Redo.EX_9_8;

public class Loan {
    double rate;
    double loan;
    int tenure;
    Loan(double loan, int tenure) {
        this.loan = loan;
        this.tenure = tenure;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMonthlyPay() {
        double monthyInterestRate = rate / 12;
        double averageInterestRate = (Math.pow((1 + monthyInterestRate), tenure) * monthyInterestRate) /
                (Math.pow((1 + monthyInterestRate), tenure) - 1);
        return this.loan * averageInterestRate;
    }
}
