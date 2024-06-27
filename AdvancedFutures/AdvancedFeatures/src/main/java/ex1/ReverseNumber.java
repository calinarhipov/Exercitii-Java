package ex1;

/*
* 	Reverse a number using while Loop. The program will prompt user to input the number
	and then it will reverse the same number using while loop
*
* 	Nr: 57134 -> 43175
*
* 	Solutia 1: o instructiune repetitiva while
*
* 	% = rest
*  	/ = cat
*
* 	while (nr > 0) {
		Pas 1: preluam restul numarului si reconstruim
		Pas 2: eliminam ultima cifra

		instructiune conditionala? -> break;
	}
	*
	*
	Iteratii:
	* #1
	 	-> 57134 % 10 -> 4
	 	-> 4 * 10 ^ 1 = 4
	 	-> 57134 / 10 = 5713
	* #2
	* 	-> 5713 % 10 -> 3
	* 	-> 4 * 10 + 3 = 43
	*   -> 5713 / 10 = 571
	*
	* Alte informatii:
	*
	* static = este un cuvant cheie care ne permite sa definim portiuni de cod (variable/atribute/obiecte/metode/functii/bloc de cod) INDEPENDENTE DE CLASA DE PROVIENIENTA
	* 	-> nu este nevoie sa definim in prealabil un obiect si sa accesam informatiile prin el
	*	-> putem sa o facem din prin denumirea clasei -> ReverseNumber.metodaMeaStatica() -> se va intoarce un rezultat cu tipul de date al metodei
*
* https://www.geeksforgeeks.org/java-io-input-output-in-java-with-examples/
* https://www.geeksforgeeks.org/bitwise-operators-in-java/
* https://beginnersbook.com/2022/09/logical-operators-in-java-with-examples/
* */

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner keylogger = new Scanner(System.in);
        int a = keylogger.nextInt();
		int reverseA = 0;

        System.out.println("Numarul original este: " + a);

        // sau a != 0
        while(a > 0) {
            reverseA = reverseA * 10 + a % 10;
            a = a / 10;
        }

        System.out.println("Numarul original: " + a);
        System.out.println("Numarul inversat: " + reverseA);

        ReverseNumber obj = new ReverseNumber();
        int reverseOfReverseA = obj.reverseNumber(reverseA);
        System.out.println(reverseOfReverseA);
    }

    public int reverseNumber(int val) {
        int reverseA = 0;

        while(val > 0) {
            reverseA = reverseA * 10 + val % 10;
            val = val / 10;
        }

        return reverseA;
    }

    // try it with static method
    // try it with void method

}
