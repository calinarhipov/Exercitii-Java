//Given an array of numbers (read from keyboard or declared),
// print all elements from it in a single line, separated by a space character
package Pack1;

public class Array1 {
    public static void main(String[] args) {

//    array[0] = 5;
//    array[1] = 6;
//    array[5] = 4;
//    array[3] = 2;
//    array[4] = 3;
//    array[4] = 3;
        int[] array = {123, 12, 32, 4, 35, 23, 1}; //e ca ordinea de mai sus
        int sum = 0;
        long produs = 1;
        for (int i = 0; i < array.length; i++) {

            //   System.out.println(array[i]+" "); //afisam elemtul de pe linia //i este 0
            sum = sum + array[i];
            produs = produs * array[i];

        }
        System.out.println("This is result of sum:" + sum);
        System.out.println("This is result of produs:" + produs);
    }
}