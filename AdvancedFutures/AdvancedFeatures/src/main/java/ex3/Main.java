package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	Pass by referance !
 */

public class Main {

    public static void main(String[] args) {
        // Citirea elementelor intr-o lista
        Scanner keylogger = new Scanner(System.in);

        int size = keylogger.nextInt();
        List<Integer> list = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            list.add(keylogger.nextInt());
        }

        // Afisarea elementelor citite
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n----------------------");
        System.out.println(list);    // se utilizeaza template-ul default al metodei toString()

        // Calculate average
        Average calculator = new Average();
        System.out.println("Media calculata iterativ este: " + calculator.calculateAverageIteratively(list));
        System.out.println("Media calculata cu streams este: " + calculator.calculateAverageWithStreams(list));
    }
}

/*
5
3 5 6 1 2
 */
