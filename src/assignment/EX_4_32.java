import java.util.Scanner;

public class EX_4_32 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String binaryNumString = input.nextLine();
        int decimalResult = 0;
        int binaryLength = binaryNumString.length();
        for (int i = binaryLength - 1; i >= 0; i--) {
            if (binaryNumString.charAt(i) == '1') {
                decimalResult += Math.pow(2, binaryLength - 1 - i);
            }
        }
        System.out.println(decimalResult);
        input.close();
    }
}