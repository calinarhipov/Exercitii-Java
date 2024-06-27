import java.util.Scanner;

//Read a number from keyboard and print 'n is even' if the number is even, or 'n is odd' otherwise
public class EvenNumber {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        int a = keyboardScanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");

        }
    }
}
