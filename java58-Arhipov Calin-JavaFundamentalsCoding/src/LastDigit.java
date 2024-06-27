import java.util.Scanner;

public class LastDigit {
    //Read a number from keyboard and print its last digit (eg. for 245 result should be 5)
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        System.out.println(n%10);
    }
}
