//Print the sum of the first, last and middle elements from array
package Pack1;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {13, 44, 23, -2, 75, 100, -22, 1}; //el. mijloc este pe pozitia 3. lungime = 7. 7/2= 3;
        //             0   1   2    3  4   5     6   7      ;    length = 8
        int arrayLength = array.length;
        //rray[arrayLength - 1] - ultimul elemnt
        int sum = array[0] + array[arrayLength - 1] + array[arrayLength/2];
        System.out.println(sum);


    }
}
