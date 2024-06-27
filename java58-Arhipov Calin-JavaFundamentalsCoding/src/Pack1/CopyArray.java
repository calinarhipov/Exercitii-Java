package Pack1;

public class CopyArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 3, 43, 12, 56, 21};
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
//        System.out.println(array);
//        System.out.println(arrayCopy);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");//afisam array ul
        }
        System.out.println("\n----");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
    }
}