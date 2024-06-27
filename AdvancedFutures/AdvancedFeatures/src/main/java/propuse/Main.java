package propuse;

import java.util.Arrays;

// https://www.scaler.com/topics/a-single-java-program-can-contain-how-many-classes/
// https://www.baeldung.com/java-access-modifiers

class Pair {
    public int min;
    public int max;
}

public class Main {
    // metoda statica default
    static Pair getMinMax(int arr[], int n) {
        Pair result = new Pair();	// obiect initializat folosind constructorul default
        Arrays.sort(arr); 			// 1000, 11, 445, 1, 330, 3000 -> 1 11 330 445 1000 3000 (SORTARE ASCENDENTA FOLOSIND CLASA ARRAYS DIN FRMK-UL COLLECTION)
        result.min = arr[0];		// elementul minim => PRIMUL ELEMENT DIN LISTA SORTATA
        result.max = arr[n - 1];	// elementul maxim => ULTIMUL ELEMENT DIN LISTA SORTATA
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = arr.length;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.println("Minimum element is " + minmax.min);
        System.out.println("Maximum element is " + minmax.max);
    }
}
