package EX_8_9;

import java.util.Scanner;
import java.security.SecureRandom;

public class MainApp {
    public static void main(String args[]) {
        SecureRandom sr = new SecureRandom();
        Scanner in = new Scanner(System.in);

        System.out.printf("請輸入 n，將產生 n 個介於 10 ~ 100 的隨機數：");
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(sr.nextInt(91) + 10);
        }
        in.close();
    }
}
