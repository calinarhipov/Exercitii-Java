package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Clasa de compilare */

/*
* Compozitia = este unul dintre principiile program
* arii orientate pe obiecte care ne permite sa conectam 2 clase prin definirea obiectelor dintr-una in alta
* */

public class Main {
    public static void main(String[] args) {
        // Citirea elementelor de la tastatura intr-o lista din Collection
        Scanner keylogger = new Scanner(System.in);

        int size = keylogger.nextInt();	//nr maxim de elemente

        List<Integer> array = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int elem = keylogger.nextInt();
            array.add(elem);

            // SAU -> array.add(keylogger.nextInt());
        }

        /*
        // Citirea elementelor de la tastatura intr-o lista primitiva
        int size = keylogger.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = keylogger.nextInt();
        }
        */

        // Sortarea elementelor
		BubbleSort sorter = new BubbleSort();	// ! LOOK UP FOR "COMPOZITIE" !
        sorter.bubbleSort(array);

        // Afisarea elementelor
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        array.forEach(it -> System.out.print(it + " "));
    }
}


// 5
// list -> _ _ _ _ _
// 57 8 2 12 4
