////mergeSort principiul de lucru este de a imprti arrayul nostru in 2 parti de ficaree data (de cate ori este nevoie)
//
//public class QuickSort {
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 23, 21, 32, 54, 22, 54, 23, 232}
//        mergeSort(arr); //metoda
//    }
//
//    private static void mergeSort(int[] arr) {
//        int n = arr.length;                    //lubgimea array-ului sta in n
//        if (n == 1) return;                    //recursia se opreste cind numarul n va fi = cu 1
//
//        int mid = n / 2;                       //for find midl //lungimea o impartim la 2
//        int[] l = new int[mid];                //left part of array - левая часть до mid//чётное количество
//        int[] r = new int[n - mid];            //right part of array - правая часть //нeчётное количество
//
//        for (int i = 0; i < mid; i++)
//            l[i] = arr[i];                    //in array-ul l[i] partea stinga e salvat
//        for (int i = mid; i < n; i++)
//            r[i - mid] = arr[i];              //partea dreapta array e salvat in r[i-mid], (r[i-mid] este pentru overflow)
//
//        mergeSort(l);                         //mergeSort e pentru a se imparte in 2 part i egale
//        mergeSort(r);
//        mergeSort(arr, l, r);
//    }
//
//    private static void mergeSort(int[] arr, int[] l, int[] r) {
//        //vom uni toate elementele
//        int left = l.length;                  //marimea array-ului din stanga
//        int right = r.length;                 //marimea array-ului din dreapta
//        int i = 0;                            //variabila i va raspunde de partea stanga
//        int j = 0;                            //variabila j va raspunde de partea dreapta
//        int idx = 0;                          //indexul numarului care va fi mai mic
//
//        while (i < left && j < right) {
//            if (l[i] < r[j]) {                  //incepem sa facem cu metoda merge luam elementele 0 din stinga si vedem daca e mai mic ca din dreapta
//                arr[idx] = l[i];               //indexul care va fi mai mic si va salva in arr[idx]
//                i++;
//                idx++;
//
//            }
//        }
//    }
//}
//
