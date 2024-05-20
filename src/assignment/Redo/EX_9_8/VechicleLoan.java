package Redo.EX_9_8;

public class VechicleLoan extends Loan {
    VechicleLoan(double loan, int tenure) {
        super(loan, tenure);
        setRate(0.2);
    }   
}
