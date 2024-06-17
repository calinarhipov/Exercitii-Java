package LP1.Avansate;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Citim sirul de caractere de la tastatura
        System.out.print("Introduceti sirul de caractere: ");
    String sir = scanner.nextLine();

    // Numaram si afisam numarul de vocale din sir
    int numarVocale = numaraVocale(sir);
        System.out.println("Numarul de vocale din sir este: "+ numarVocale);

    // Inversam sirul de caractere
    String sirInversat = inverseazaSirul(sir);
        System.out.println("Sirul inversat este: " + sirInversat);
}

    // Metoda pentru numararea vocalelor dintr-un sir
    public static int numaraVocale(String sir) {
        int numarVocale = 0;
        sir = sir.toLowerCase(); // Convertim sirul la litere mici pentru a putea verifica vocalele

        for (int i = 0; i < sir.length(); i++) {
            char caracter = sir.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                numarVocale++;
            }
        }

        return numarVocale;
    }

    // Metoda pentru inversarea unui sir de caractere
    public static String inverseazaSirul(String sir) {
        StringBuilder sirInversat = new StringBuilder();
        for (int i = sir.length() - 1; i >= 0; i--) {
            sirInversat.append(sir.charAt(i));
        }
        return sirInversat.toString();
    }
}