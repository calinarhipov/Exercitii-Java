package LP1.StructuriDeControl;

//1.1.   Scrie un program care să afișeze toate numerele pare între 1 și 100 folosind o buclă for.

public class Ex1 {
    public static void main(String[] args) {
        // Iterăm prin fiecare număr între 1 și 100
        for (int i = 0; i <= 100; i++) {
            // Verificăm dacă numărul curent este par, % - rest
            if (i % 2 == 0) {
                //Afidsm numarul par prin incrementare si cu mesajul de la tastatura in ghilimele
                System.out.println("Numerele pare pana la 100 sunt: " + i);
            }
        }
    }
}
