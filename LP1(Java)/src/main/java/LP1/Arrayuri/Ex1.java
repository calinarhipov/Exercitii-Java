package LP1.Arrayuri;

//2.1  Scrie un program în Java care să găsească și să afișeze
//     valoarea maximă și pozițiile acesteia într-un array.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = {4, 23, 6, 22, 7, 19};

        int max = numbers[0]; //valoarea maxima
        int position = 0;     //pozitia maxima
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                 max = numbers[i];
                position = i;
            }
        }
        System.out.println("Valoarea maxima este: " + max);
        System.out.println("Pozitita maximului element este: " + position);

    }
}
