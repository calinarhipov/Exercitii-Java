//Given an array of numbers and a desired number (read from keyboard or declared), check if the desired number is included in the array and print an according message
package Pack1;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

        int array[] = {2, 34, 21, 45, 46, 45, 90};
        Scanner scanner = new Scanner(System.in);
        int searchedNumber = scanner.nextInt();

        boolean isFoundInArray = false;
        for (int i = 0; i < array.length; i++) {
            if (searchedNumber == array[i]) {
                isFoundInArray = true;
                break;
            }
        }
        if (isFoundInArray) {
            System.out.println("The number is included in array");
        } else {
            System.out.println("The number is not included in array");
        }

    }
}
