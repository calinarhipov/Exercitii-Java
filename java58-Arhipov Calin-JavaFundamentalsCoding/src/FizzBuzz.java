import java.util.Scanner;

//Read a number 'n' from keyboard and print all the numbers from 1 to n on a new line, but with the following rules:
// - if the current number is divisible by 3 print 'Fizz' instead of the actual number
// - if the current number is divisible by 7 print 'Buzz' instead of the actual number
// - if the current number is divisible by both 3 and 7 print 'Fizz Buzz' instead of the actual number
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        int n = keyboardScanner.nextInt(); //10
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0 ) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }


}
