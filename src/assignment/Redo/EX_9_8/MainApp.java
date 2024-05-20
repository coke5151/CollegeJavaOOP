package Redo.EX_9_8;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double loan = sc.nextDouble();
        int tenure = sc.nextInt();

        HomeLoan h = new HomeLoan(loan, tenure);
        VechicleLoan v = new VechicleLoan(loan, tenure);
        PersonalLoan p = new PersonalLoan(loan, tenure);

        System.out.printf("HomeLoan: $%f\n", h.getMonthlyPay());
        System.out.printf("VechicleLoan: $%f\n", v.getMonthlyPay());
        System.out.printf("PersonalLoan: $%f\n", p.getMonthlyPay());
        sc.close();
    }
}
