
public class EX6_25_2 {
    public static int determineIsThisPrime(int n) {
        if (n == 1) {
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
        System.out.println("Print all the primes up to 10000:");
        int allCheckNumbers = 0;
        int finalValue;
        for (int i = 1; i <= 2; i++) {
            finalValue = determineIsThisPrime(i);
            if (finalValue == -1) {
                System.out.println(i);
            }
            allCheckNumbers++;
        }
        for (int i = 3; i <= 10000; i += 2) {
            finalValue = determineIsThisPrime(i);
            if (finalValue == -1) {
                System.out.println(i);
            }
            allCheckNumbers++;
        }
        System.out.printf("\n共檢查了 %d 個數字", allCheckNumbers);
    }
}
