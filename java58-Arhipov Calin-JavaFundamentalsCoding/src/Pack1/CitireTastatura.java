//Read a number n from keyboard that represents an array length.
// Then, read n elements and store them in a Java array.
package Pack1;

import java.util.Scanner;

public class CitireTastatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   System.out.println(Math.PI *scanner.nextFloat());
        int n = scanner.nextInt(); //declaram nr de elemente din array
        int[] array = new int[n]; //declaram array ul si cate elemente are
        for (int i = 0; i < n; i++) {
            {
                array[i] = scanner.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
