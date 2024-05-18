package EX_9_8;

public abstract class Loan {
    private double loan;
    private int tenure;
    private double interestRate;

    Loan(double loan, int tenure, double interestRate) {
        this.setLoan(loan);
        this.setTenure(tenure);
        this.setInterestRate(interestRate);
    }

    public void setLoan(double loan) {
        if (loan > 0) {
            this.loan = loan;
        } else {
            System.out.println("Loan must be > 0.");
        }
    }

    public void setTenure(int tenure) {
        if (tenure > 0) {
            this.tenure = tenure;
        } else {
            System.out.println("Tenure must be > 0 (months).");
        }
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("InterestRate muse be >=0.");
        }
    }

    public double getLoan() {
        return this.loan;
    }

    public int getTenure() {
        return this.tenure;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    // 本息平均攤還法
    public double getMonthlyPay() {
        double monthyInterestRate = interestRate / 12;
        double averageInterestRate = (Math.pow((1 + monthyInterestRate), tenure) * monthyInterestRate) /
                (Math.pow((1 + monthyInterestRate), tenure) - 1);
        return this.loan * averageInterestRate;
    }
}
