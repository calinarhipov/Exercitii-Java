import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        //System.out.println(n%10);
        while (n>9){
            n=n/10; //n = 452. imparte la 10 de 2 ori si va da 4 la final
        }
        System.out.println(n);
    }
}
