package Pack1;

public class Array {
    public static void main(String[] args) {
     //   int n = 0; //se declara nu nr de la tastatura
        int[] array = new int[5]; //6 0 0 0 0 //am declarat un sir de numere intregi(un array)
        array[0] = 6;//pe pozitia 0 a array-ului dam valoarea 6: 6 0 0 0 0
        array[4] = 25;
        array[2] = 101;
        array[3] = 23;
        //ultimul element din array este n-1
        System.out.println(array[4]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        //vreau sa salvez intr-o variabila element de pe pozitia 3
        int x = array[3];
    }
}
