package LP1.Avansate;

//2.1  Scrie un program în Java care să găsească și să afișeze valoarea
//     maximă și pozițiile acesteia într-un array si sortarea array-ului in ordine crescatoare.

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = {10, 7, 13, 25, 6, 18, 13}; // Array-ul nostru

        // Găsim valoarea maximă și pozițiile acesteia
        int max = array[0];  //valoarea maxima
        int[] pozitiiMaxime = new int[array.length];
        int numarPozitiiMaxime = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                numarPozitiiMaxime = 0;
                pozitiiMaxime[numarPozitiiMaxime++] = i;
            } else if (array[i] == max) {
                pozitiiMaxime[numarPozitiiMaxime++] = i;
            }
        }

        // Afisam valoarea maxima si pozitiile acesteia
        System.out.println("Valoarea maxima din array este: " + max);
        System.out.print("Aceasta apare pe pozitiile: ");
        for (int i = 0; i < numarPozitiiMaxime; i++) {
            System.out.print(pozitiiMaxime[i] + " ");
        }
        System.out.println();

        // Sortam array-ul in ordine crescatoare
        Arrays.sort(array);

        // Afisam array-ul sortat
        System.out.println("Array-ul sortat in ordine crescatoare: " + Arrays.toString(array));
    }
}

