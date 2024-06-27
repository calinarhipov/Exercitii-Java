package ex5;

import java.util.ArrayList;
import java.util.List;

/*
	Modificatori de acces:
		public -> ne permite sa apelam metodele sau atributele din orice parte a proiectului, adica din orice clasa externa care le apeleaza
		private -> ne permite sa apelam metodele sau atributele DOAR din clasa in care au fost definite
			-> o consecinta este faptul ca pot fi apelate in alte metode CARE EXISTA IN ACEEASI CLASA de definitie
		protected -> ne permite sa apelam metodele sau atributele DIN CLASELE care se afla intr-o relatie de mostenire directa
			-> cautati principiile OOP -> mostenirea
			-> o consecinta este faptul ca o metoda protected e apelata in clasa de definitie sau in clasele COPIL
			-> in alte clase, aceste metode nu vor fi vizibile!!!!
 */

public class StringFiltering {

    private boolean checkSize(String word, int size) {
        return word.length() == size;
    }

    private boolean checkStartingLetter(String word, String startingLetter) {
        return word.startsWith(startingLetter);	//SAU word.charAt(0) == startingLetter, unde startingLetter este de tipul char
    }

    public List<String> extractFilteredListIteratively(List<String> originalList) {
        List<String> result = new ArrayList<>();

        // method logic
        for (int i = 0; i < originalList.size(); i++) {
            //apeam cele 2 metode intr-un if
            if(checkSize(originalList.get(i), 3)
                    && checkStartingLetter(originalList.get(i), "a") == true) {
                result.add(originalList.get(i));
            }
        }

        return result;
    }

    public List<String> extractFilteredListWithStreams(List<String> originalList) {
        return originalList.stream()
                .filter(it ->  it.length() == 3 && it.startsWith("a"))
                .toList();
    }
}
