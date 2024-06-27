//Given an array of numbers (read from keyboard or declared),
// find the minimum value from the array and print it
package Pack1;

public class Array4 {
    public static void main(String[] args) {
        int[] array = {1, 3, 45, 2, -2, 1, 44};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
