package LP2.Varianta1;

//a)	Identifică elementul cel mai mic și cel mai mare.
//Input (intrare)	          Output (rezultat)
//v1[]={3,5,8,6,2,7,10,11}	  min=2
//                            max=11

import jdk.swing.interop.SwingInterOpUtils;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 6, 2, 7, 10, 11};
        int max = valMax(arr);
        int min = valMin(arr);

        System.out.println("Valoarea maxima: " + max);
        System.out.println("Valoarea minima: " + min);

    }

    private static int valMin(int[] arr) {
        int minim = arr[0];
        for (int i = 0; i <= minim; i++) {
            if (minim > i) {
                i = valMax(arr);
            }
        }
        return 0;
    }

    private static int valMax(int[] arr) {
          int maxim = arr[0];
        for (int i = 0; i <= maxim; i++) {
            if (maxim < i) {
                i = valMin(arr);
            }
        }
        return 0;
    }
}