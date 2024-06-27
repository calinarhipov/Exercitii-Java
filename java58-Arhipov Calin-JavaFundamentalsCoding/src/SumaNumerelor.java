import java.util.Scanner;
//introdu un numar de la tastatura si fa adunarea numerelor de la 0 la numarul respectiv
public class SumaNumerelor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum += i;
        }
        System.out.println("Rezultatul este: " + sum);
    }
}
