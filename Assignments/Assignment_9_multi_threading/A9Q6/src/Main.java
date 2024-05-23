class PrimeG implements Runnable {
    private final int start;
    private final int end;

    public PrimeG(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

            
            Thread t = new Thread(new PrimeG(1, 10));
            t.start();
        }
    }

