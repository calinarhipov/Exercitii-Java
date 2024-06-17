package LP1.SiruriDeCaractere;

// Scrie un program  care să numere
// și să afișeze numărul de vocale dintr-un șir de caractere dat.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //initializam obiectul Scanner cu numele scanner
        Scanner scanner = new Scanner(System.in);

        // Citim șirul de caractere de la utilizator
        System.out.print("Introdu un sir de caractere: ");
        String sirCaractere = scanner.nextLine().toLowerCase(); // Convertim totul în litere mici pentru a trata toate vocalele la fel

        // Numărăm vocalele în șirul de caractere
        int numarVocale = 0;
        for (int i = 0; i < sirCaractere.length(); i++) {
            char caracter = sirCaractere.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                numarVocale++;
            }
        }

        // Afișăm rezultatul
        System.out.println("Numarul de vocale din sirul dat este: " + numarVocale);
    }
}
