public class EX_23_23 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrimeCounter(2, 10000));
        Thread thread2 = new Thread(new PrimeCounter(10000, 20000));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class PrimeCounter implements Runnable {
    private int start;
    private int end;

    public PrimeCounter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Number of prime numbers between " + start + " and " + end + " is " + count);
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}