package ex6;

/*
    Write a method that returns a comma-separated string based on a given list of integers.
    Each element should be preceded by the letter 'e' if the number is even, and preceded by
    the letter 'o' if the number is odd. For example, if the input list is (3,44), the output
    should be 'o3,e44'. Use streams.

    Logica:
    	1. convertim lista de numere intregi la stream
    	2. mapam conversia numerelor intregi dupa regula stabilita pentru fiecare element in parte
    	3. colectam totul intr-un string care are ca delimitator ","

 */

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Declaratia listei de numere intregi
        List<Integer> list = Arrays.asList(3, 44, 78, 9, 21, 2415, 643);
        System.out.println(list);

        // Conversia la noua forma
        AlteringForm mapper = new AlteringForm();
        System.out.println(mapper.alterForm(list));
    }
}
