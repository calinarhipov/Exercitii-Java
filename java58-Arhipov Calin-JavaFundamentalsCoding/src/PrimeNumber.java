import java.util.Scanner;
//Read a number from keyboard and print 'n is a prime' if the number is prime and 'n is not a prime' otherwise.
// A number n is prime if it has exactly 2 divisors (1 and n itself). (eg. of prime numbers : 2, 3, 5, 11, 23)

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner keyLogger = new Scanner(System.in);
        int n = keyLogger.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;

                break;
            }
        }
        if (isPrime) {
            System.out.println("n is prime");
        } else System.out.println("n is not prime");
    }
}
