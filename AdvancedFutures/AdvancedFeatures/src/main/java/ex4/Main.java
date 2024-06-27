package ex4;

import java.util.Arrays;
import java.util.List;

/*
	Ce este un String?
		Un string este o LISTA de CARACTERE -> char (tipul de date primitiv), Character (tipul de date wrapper).
		O forma alternativa a stringului este List<char> sau List<Character>.

	Mai exista si o forma mai specializata care aduce noi functionalitati in discutie -> StringBuilder.

	Putem considera ca o lista de stringuri (List<String>) este o matrice de caractere (List<List<char>>).
 */

public class Main {

    public static void main(String[] args) {
        // Declaratia listei folosind Arrays
        List<String> list = Arrays.asList("Ana", "ARE", "MeRe", "sI", "perE");
        System.out.println(list);

        // Conversia la uppercase
        StringUtil converter = new StringUtil();
        System.out.println(converter.convertToUppercaseIteratively(list));

        System.out.println();

        System.out.println(list);
        System.out.println(converter.convertToUppercaseWithStreams(list));
    }
}
