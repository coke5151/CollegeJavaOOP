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
    }
}
