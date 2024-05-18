package EX_9_8;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double loan;
        int tenure;

        System.out.print("請輸入貸款金額：");
        loan = in.nextDouble();
        System.out.print("請輸入總貸款期限（月）：");
        tenure = in.nextInt();        
        in.close();

        HomeLoan house = new HomeLoan(loan, tenure);
        VechicleLoan car = new VechicleLoan(loan, tenure);
        PersonalLoan credit = new PersonalLoan(loan, tenure);

        System.out.printf("HomeLoan:\t monthly pay %.1f\n", house.getMonthlyPay());
        System.out.printf("VechicleLoan:\t monthly pay %.1f\n", car.getMonthlyPay());
        System.out.printf("PersonalLoan:\t monthly pay %.1f\n", credit.getMonthlyPay());
    }
}
