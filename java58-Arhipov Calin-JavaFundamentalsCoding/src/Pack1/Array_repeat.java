package Pack1;

import java.util.Scanner;

public class Array_repeat {
    public static void main(String[] args) {
//
//        int[] array = {12, 32, 354, 2, 24, 5, 3};
//        int sum = 0;
//        long produs = 1;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//            produs = produs * array[i];
//        }
//
//        System.out.println("This is result of sum:" + sum);
//        System.out.println("This is result of produs:" + produs);
//    }
//This is result of sum:432
//This is result of produs:97873920

        //Ex2: Print the sum of the first, last and middle elements from array
//   int[] array = {12, 34, 20, 43, 34, 73, 393};
//       int arrayLength = array.length;

//       int sum = array[0] + array[arrayLength - 1] + array[arrayLength / 2];
//       System.out.println("This is sum: " + sum);
//   }

        //Ex3: //Given an array of numbers and a desired number (read from keyboard or declared),
        //check if the desired number is included in the array and print an according message
//
//        int array[] = {20, 43, 234, 20, 123, 3, 2};
//        Scanner scanner = new Scanner(System.in);
//        int searchedNumber = scanner.nextInt();
//
//        boolean isFoundArray = false;
//        for (int i = 0; i < array.length; i++) {
//            if (searchedNumber == array[i]) {
//                isFoundArray = true;
//                break;
//            }
//        }
//        if (isFoundArray) {
//            System.out.println("The number is included in array");
//        } else {
//            System.out.println("The number is not included in array");
//        }
//    }
        // Ex4: //Given an array of numbers (read from keyboard or declared),
        // find the maximum value from the array and print it
//        int[] array = {20, 43, 234, 20, 123, 3, 2};
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) { //daca elementul e > atunci nu se intra in if
//            if(array[i] > max){
//                max = array[i];//din max devine array[i](i se atribuie)
//            }
//        }
//        System.out.println(max);
        //Ex:5  //Read a number n from keyboard that represents an array length. Then, read n
                //elements and store them in a Java array.
        Scanner keyboardReader = new Scanner(System.in);
        int n = keyboardReader.nextInt();  //citim un nr. de la tastatura //declaram nr. de elem. din array
        int[] array = new int[n];     //declaram array ul si cate elemente are(n)
        for (int i = 0; i < n; i++) {
            array[i] = keyboardReader.nextInt();         //ca sa avem pe fiecare pozitie nr de la tastatura
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");

        }
    }
}


