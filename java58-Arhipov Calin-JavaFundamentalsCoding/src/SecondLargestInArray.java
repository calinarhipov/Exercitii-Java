//Write a Java program to find second largest number in the given array.
//For example the second largest number in the array {7,5,6,1,4,2} is 6.

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 6, 1, 4, 2};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest && number != firstLargest) {
                secondLargest = number;
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number.");
        }
    }
}
