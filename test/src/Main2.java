
@FunctionalInterface
interface CheckPrime {
    boolean check(int number);
}

public class Main2 {
    public static void main(String[] args) {
        // Define a lambda function to check if a number is prime
        CheckPrime isPrime = number -> {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };

        // Generate and print the first 100 prime numbers
        int count = 50;
        int num = 50;
        while (count <= 60) {
            if (isPrime.check(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}