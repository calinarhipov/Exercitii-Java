package ex3;

import java.util.List;

public class Average {

    /*
    Template pentru metode care returneaza un rezultat cu un tip de date diferit de void:
    	- pentru usurinta declaram la inceputul metodei o variabila/o structura de date care sa aiba acelasi tip de date precum metoda in sine
    	- la final returnam variabila/structura de date creata
    	- iar in mijloc implementam logica metodei
     */
    public double calculateAverageIteratively(List<Integer> list) {
        double result = 0;

        // method logic
        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }
        result = result / list.size();

        return result;
    }

    /*
    Ce este un stream?
    	Un stream este o modalitate de parcurgere optima a structurilor
    	de date care ne permite sa efectuam anumite operatii prestabilite.

    Logica:
    	1. transformam lista intr-un Stream<Integer> -> fiecare element este convertit la o valoare incapsulata tipica streamurilor
    	2. convertit toate elementele de tipul Stream<Integer> la un tip de date specializat calculelor numerice -> DoubleStream
    	3. calculam media -> iterativ se calculeaza in spate suma, si pe urma se imparte la dimensiunea listei
    	4. colectam informatia in forma dorita
     */
    public Double calculateAverageWithStreams(List<Integer> list) {
        Double result = 0.0;

        // method logic
        result = list.stream()
                .mapToDouble(it -> it.doubleValue())
                .average()
                .getAsDouble();

        return result;
    }
}
