import java.util.Scanner;

public class EX_5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int howManyNumbers = 0;
        int[] allNumbers = new int[5];
        int tempForInput;
        System.out.println("請輸入 5 個介於 1（含）和 30（含）之間的數：");
        while (true) {
            tempForInput = input.nextInt();
            if (tempForInput < 1 || tempForInput > 30) {
                System.out.printf("不好意思，請輸入介於 1（含）和 30（含）的數，%d 將不會被記錄，請繼續輸入：\n", tempForInput);
            } else {
                allNumbers[howManyNumbers] = tempForInput;
                howManyNumbers++;
                if (howManyNumbers == 5) {
                    break;
                }
            }
        }
        System.out.println("已接收五個輸入，輸出結果：");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < allNumbers[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}