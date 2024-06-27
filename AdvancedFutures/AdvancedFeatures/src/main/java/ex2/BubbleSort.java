package ex2;

/* Clasa de obiect pentru o functionalitate de sortare */

/* Logica algoritmului:
 *
 * 	for #1 -> are scopul de a oferi control asupra numarului de sortari (parcurgeri ale listei nesortate) pe care le facem
 * 		-> cu fiecare iteratie, vom verifica toate elementele ADIACENTE (vecine in perechi (j, j+1)) si vom interschimba (SWAP) in cazul in care ordinea este gresita
 * 	for #2 -> are scopul de a implementa instructiunea conditionala si de a parcurge lista LIMITAT la numarul de iteratii complete (i din for #1)
 * 		-> vom verifica lista de size - 1 - i ori
 *
 * 	DE CE size - 1?
 * 		R: pentru ca ne dorim sa parcurgem lista MEREU pana la penultimul element
 * 		In caz contrar, daca am merge pana la ultimul, la verificarea j > j + 1, vom sari din lista! -> Array Index Out Of Bounds Exception (https://www.geeksforgeeks.org/array-index-out-of-bounds-exception-in-java/)
 *
 * 	conditionala -> vom face o verificare PSEUDO-NEGATIVA prin care ne dorim pe ramura de adevar sa avem elementul de pe pozitia j mai mare decat elementul de pe pozitia j+1
 * 		-> daca ordinea este inversata (MARE MIC) facem swap (INTERSCHIMBARE) intre cele doua elemente din lista pt a avea (MIC MARE)
 * 		-> VERIFICAREA CONDITIONALA ESTE STRICTA
 *
 * 	Pentru schimbarea ordinii de sortare -> schimbam simbolul < sau > din instructiunea conditionala IF
 * */

/*
	RESURSE SORTARE:
		https://www.geeksforgeeks.org/bubble-sort/
		https://visualgo.net/en/sorting
		https://interviewnoodle.com/sorting-algorithms-cheat-sheet-1b05b5572b85
		https://www.interviewcake.com/sorting-algorithm-cheat-sheet

	RESURSE COMPLEXITATE:
		https://www.geeksforgeeks.org/understanding-time-complexity-simple-examples/

	RESURSE LAMBDA -> STREAM:
		https://www.w3schools.com/java/java_lambda.asp#:~:text=Lambda%20Expressions%20were%20added%20in,parameters%20and%20returns%20a%20value.
		https://medium.com/javarevisited/java-streams-for-beginners-105ed3aa2f74
		https://stackify.com/streams-guide-java-8/
		https://www.makeuseof.com/java-streams/
 */

import java.util.List;

public class BubbleSort {

    public void bubbleSort(List<Integer> array) {
        boolean swapped = false;

        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1 - i; j++) {
                if (array.get(j) < array.get(j + 1)) {
                    /*
                    // Varianta 1: interschimbarea cu elemente PRIMITIVE
					int aux = array.get(j);
                    array.get(j) = array.get(j+1);
                    array.get(j+1) = aux;
                    */

                    // Varianta 2: interschimbarea cu elemente WRAPPER
                    Integer aux = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, aux);
                    swapped = true;

                    /*
                    // Varianta 3: interschimbarea cu metoda SWAP din Collections
                    Collections.swap(array, j, j + 1);
                    */
                }
            }

//            if(swapped == true)
//                break;
        }
    }

    /*
    Iteratii:
    dimensiune for #2 -> size - 1 - i = 5 - 1 - 0 = 4
    i = 0, j = 0 -> 57 > 8 ? SWAP -> 8 57 2 12 4
    i = 0, j = 1 -> 57 > 2 ? SWAP -> 8 2 57 12 4
    i = 0, j = 2 -> 57 > 12 ? SWAP -> 8 2 12 57 4
    i = 0, j = 3 -> 57 > 4 ? SWAP -> 8 2 12 4 57
    i = 0, j = 4 => j < array.size() - 1 - i => 4 < 4 -> FALSE -> i++

    dimensiune for #2 -> size - 1 - i = 5 - 1 - 1 = 3
    i = 1, j = 0 -> 8 > 2 ? SWAP -> 2 8 12 4 57
    i = 1, j = 1 -> 8 > 12 ? NU SE INTAMPLA NIMIC
    i = 1, j = 2 -> 12 > 4 ? SWAP -> 2 8 4 12 57
    i = 1, j = 3 => j < array.size() - 1 - i => 3 < 3 -> FALSE -> i++

    dimensiune for #2 -> size - 1 - i = 5 - 1 - 2 = 2
    i = 2, j = 0 -> 2 > 8 ? NU SE INTAMPLA NIMIC
    i = 2, j = 1 -> 8 > 4 ? SWAP 2 4 8 12 57
    i = 2, j = 2 => j < array.size() - 1 - i => 2 < 2 -> FALSE -> i++

    dimensiune for #2 -> size - 1 - i = 5 - 1 - 3 = 1
    i = 3, j = 0 -> 2 > 4 ? NU SE INTAMPLA NIMIC
    i = 3, j = 1 => j < array.size() - 1 - i => 1 < 1 -> FALSE -> i++

    i = 4 -> size = 5 -> i < size - 1 -> 4 < 4 -> SE IESE din primul for
     */

}
