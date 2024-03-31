public class EX6_25_3 {
    public static int determineIsThisPrimeToSqrt(int n) {
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

    public static int determineIsThisPrimeToHalf(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0 && n != 2) {
            return 2;
        } else {
            boolean nIsPrime = true;
            int nCanBeDividedBy = 0;
            for (int i = 3; i <= n/2; i += 2) {
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
        System.out.println("用不同方法檢查 1 ~ 10000 的所有數字是不是質數：");
        int finalValueByHalfMethod, finalValueBySqrtMethod;
        int sameResults = 0;
        int differentResults = 0;
        for(int i = 1; i <= 10000; i++){
            finalValueByHalfMethod = determineIsThisPrimeToHalf(i);
            finalValueBySqrtMethod = determineIsThisPrimeToSqrt(i);
            if(finalValueByHalfMethod != finalValueBySqrtMethod){
                differentResults++;
            } else {
                sameResults++;
            }
        }
        System.out.printf("從 1 ~ 10000 這些數字中，同時使用 determineIsThisPrimeToHalf 和 determineIsThisPrimeToSqrt 方法進行質數檢查，共找到 %d 個一樣的判斷結果、%d 個不一樣的判斷結果。\n", sameResults, differentResults);
    }
}
