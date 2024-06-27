import java.util.Scanner;
//Read a number from keyboard and print its factorial (eg. for 5, the result should be 120 : 5*4*3*2*1). Be careful that 0! = 1
public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);



    }
}
