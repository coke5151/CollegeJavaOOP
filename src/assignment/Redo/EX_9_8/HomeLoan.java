package Redo.EX_9_8;

public class HomeLoan extends Loan {
    HomeLoan(double loan, int tenure) {
        super(loan, tenure);
        setRate(0.10);
    }   
}
