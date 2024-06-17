package LP1.Functii;

//2.1  Creează o funcție care să calculeze factorialul unui număr dat.

public class Factorial {
      //Functia pentru calculul factorialului
    public static int calculFactorial(int n) {

        //Verificam daca nr. e negativ
        if(n < 0){
            throw new RuntimeException("Numarul nu poate fi negativ!");
        }
        //Initializam variabila factorial cu 1 apoi mergem cu un for de la 1 la 5
        //apo executam calculul
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i; //sau: factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        //initializam var. numar cu 5 si afisam apeland functia.
        int numar = 6;
        System.out.println("Factorial of " + numar + " is: " + calculFactorial(numar));

    }
}
//        int a = 0;
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            a = i * n;
//        }
//        System.out.println("Numarul factorial: " + a);


