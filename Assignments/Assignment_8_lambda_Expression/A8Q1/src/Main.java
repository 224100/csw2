class SharedPrinter {
    private boolean evenFlag = false;

    public synchronized void printEven(int number) {
        while (!evenFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
        evenFlag = false;
        notify();
    }

    public synchronized void printOdd(int number) {
        while (evenFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
        evenFlag = true;
        notify();
    }
}
class EvenNumberGenerator implements Runnable {
    private final int max;
    private final SharedPrinter printer;

    public EvenNumberGenerator(int max, SharedPrinter printer) {
        this.max = max;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i += 2) {
            printer.printEven(i);
        }
    }
}

class OddNumberGenerator implements Runnable {
    private final int max;
    private final SharedPrinter printer;

    public OddNumberGenerator(int max, SharedPrinter printer) {
        this.max = max;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= max; i += 2) {
            printer.printOdd(i);
        }
    }
}public class Main {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();
        Thread evenThread = new Thread(new EvenNumberGenerator(10, printer));
        Thread oddThread = new Thread(new OddNumberGenerator(10, printer));
        evenThread.start();
        oddThread.start();
    }
}