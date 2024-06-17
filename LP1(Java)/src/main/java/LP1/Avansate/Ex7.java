package LP1.Avansate;

import java.util.Scanner;

//Elaborează un program care va aloca un array de valori intregi și va realiza  următoarele funcții:
//-	citirea de la tastatură a elementelor tabloului;
//-	afișarea la consolă a elementelor tabloului;
//-	inserarea unui element nou la capătul tabloului;
//-	inserarea unui element nou la începutul tabloului;
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea lungimii tabloului de la tastatură
        System.out.print("Introduceți lungimea tabloului: ");
        int lungime = scanner.nextInt();

        // Inițializarea tabloului de lungime dată
        int[] tablou = new int[lungime];

        // Citirea elementelor tabloului de la tastatură
        citesteTablou(scanner, tablou);

        // Afișarea elementelor tabloului
        System.out.println("Elementele tabloului sunt:");
        afiseazaTablou(tablou);

        // Inserarea unui element nou la capătul tabloului
        System.out.print("Introduceți elementul pentru a fi inserat la capătul tabloului: ");
        int elementCapat = scanner.nextInt();
        tablou = insereazaLaCapat(tablou, elementCapat);

        // Afișarea elementelor tabloului după inserarea la capăt
        System.out.println("Elementele tabloului după inserarea la capăt sunt:");
        afiseazaTablou(tablou);

        // Inserarea unui element nou la începutul tabloului
        System.out.print("Introduceți elementul pentru a fi inserat la începutul tabloului: ");
        int elementInceput = scanner.nextInt();
        tablou = insereazaLaInceput(tablou, elementInceput);

        // Afișarea elementelor tabloului după inserarea la început
        System.out.println("Elementele tabloului după inserarea la început sunt:");
        afiseazaTablou(tablou);

        scanner.close();
    }

    // Funcția pentru citirea elementelor tabloului de la tastatură
    public static void citesteTablou(Scanner scanner, int[] tablou) {
        System.out.println("Introduceți elementele tabloului:");
        for (int i = 0; i < tablou.length; i++) {
            System.out.print("Elementul " + (i + 1) + ": ");
            tablou[i] = scanner.nextInt();
        }
    }

    // Funcția pentru afișarea elementelor tabloului
    public static void afiseazaTablou(int[] tablou) {
        for (int element : tablou) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Funcția pentru inserarea unui element nou la capătul tabloului
    public static int[] insereazaLaCapat(int[] tablou, int element) {
        int[] nouTablou = new int[tablou.length + 1];
        for (int i = 0; i < tablou.length; i++) {
            nouTablou[i] = tablou[i];
        }
        nouTablou[tablou.length] = element;
        return nouTablou;
    }

    // Funcția pentru inserarea unui element nou la începutul tabloului
    public static int[] insereazaLaInceput(int[] tablou, int element) {
        int[] nouTablou = new int[tablou.length + 1];
        nouTablou[0] = element;
        for (int i = 0; i < tablou.length; i++) {
            nouTablou[i + 1] = tablou[i];
        }
        return nouTablou;
    }
}