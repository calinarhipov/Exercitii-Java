package ex5;

/*
    Given a list of strings, write a method that returns a list of all strings that start with the
    letter 'a' (lower case) and have exactly 3 letters using streams.

    1. verificare string incepe cu 'a'
    2. verificare string are 3 litere
    3. creeare sublista cu cele 2 filtre
*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Declaratia listei
        List<String> list = Arrays.asList("ana", "are", "mere", "si", "apa", "wow", "aparatura", "ananas");
        System.out.println(list);

        // Filtrarea dupa cele 2 conditii
        StringFiltering filter = new StringFiltering();
        System.out.println(filter.extractFilteredListIteratively(list));
        System.out.println(filter.extractFilteredListWithStreams(list));
    }
}
