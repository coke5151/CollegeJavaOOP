import java.util.Scanner;

public class EX6_25_1 {
    public static int determineIsThisPrime(int n) {
        if(n == 1){
            return 1;
        }
        if (n % 2 == 0 && n != 2) {
            return 2;
        } else {
            boolean nIsPrime = true;
            int nCanBeDividedBy = 0;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    nIsPrime = false;
                    nCanBeDividedBy = i;
                    break;
                }
            }
            if (nIsPrime) {
                return -1;
            } else {
                return nCanBeDividedBy;
            }
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入一正整數 n，我會判斷它是不是質數：");
        while (true) {
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("輸入錯誤！請輸入正整數，不能小於等於 0");
            } else {
                break;
            }
        }
        int finalValue = determineIsThisPrime(n);
        if (finalValue == -1) {
            System.out.printf("你所輸入的正整數 %d 是質數。\n", n, finalValue);
        } else if (finalValue == 1) {
            System.out.println("根據定義，1 不是質數。");
        } else {
            System.out.printf("你所輸入的正整數 %d 不是質數，因為我發現它至少能被 %d 整除", n, finalValue);
        }
        input.close();
    }
}
