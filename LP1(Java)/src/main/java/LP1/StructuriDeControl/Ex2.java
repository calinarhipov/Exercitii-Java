package LP1.StructuriDeControl;

//1.2.   Scrie un program pentru a afișa numerele impare între 1 și 100 folosind o buclă while.

public class Ex2 {
    public static void main(String[] args) {

        int num = 1;
        while (num <= 100) {
            if (num % 2 != 0) {
                System.out.println("Number odd is: " + num);
            }
            num++;
        }
    }
}
