package Pack1;

public class Operatori {
    public static void main(String[] args) {
        // Declara o variabilă pentru vârstă
        int varsta = 20;

        // Utilizează operatorul ternar pentru a verifica dacă este adult sau minor
        // variabila = (condiție) ? valoare_dacă_adevărat : valoare_dacă_fals;

        String status = (varsta >= 18) ? "adult" : "minor";

        // Afișează rezultatul
        System.out.println("Starea este: " + status);
    }
}


