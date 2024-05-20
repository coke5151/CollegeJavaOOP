package Redo.EX_9_8;

public class PersonalLoan extends Loan {
    PersonalLoan(double loan, int tenure) {
        super(loan, tenure);
        setRate(0.69);
    }    
}