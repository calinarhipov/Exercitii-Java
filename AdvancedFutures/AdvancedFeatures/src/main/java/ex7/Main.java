package ex7;

/*
    Create Employee class with id, name and salary fields. DONE

    Create necessary methods and constructor. DONE

    Create 3 instances of the Employee class and add them to a list. DONE

    Using streams, find first Employee that is not null and has salary of at least 30000.
    If not found, throw exception.

 */

/*
	RESURSE STREAMS:
		https://cheatography.com/carlmig/cheat-sheets/java-8-streams/
		https://stackify.com/streams-guide-java-8/
		https://www.makeuseof.com/java-streams/
 */

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/*
	Exceptia = este o ANTICIPATIE a unui caz de eroare
		-> scopul principal este de a crea exceptii personificate ale unor erori
		standardizate pentru a putea adauga mai multe informatii specifice relevante
		-> ne permite sa identificam mult mai usor si concret o posibila eroare atat prin denumirea specifica,
		cat si prin log-urile acesteia
		-> pentru a crea clase de exceptie personalizate este nevoie sa EXTINDEM alte exceptii

	De documentat:
		-> cautati diferenta dintre RUNTIME EXCEPTION vs COMPILE TIME EXCEPTION	-> https://www.geeksforgeeks.org/difference-between-compile-time-and-run-time-polymorphism-in-java/
		-> cand se foloseste try catch in contextul exceptiilor
 */

public class Main {

    public static void main(String[] args) {
        // Declaratia statica a unei liste folosind constructori
        List<Employee> employeeList = new ArrayList<>(
                List.of(
                        new Employee(1, "Ion", 7000),
                        new Employee(2, "Ioana", 12000),
                        new Employee(3, "Matei", 35000),
                        new Employee(4, "Maria", 30000)
                )
        );
        System.out.println(employeeList);
        System.out.println();

        /* SOLUTIA EXTINSA */
        // Pas 1: Reducem lista la o sublista care respecta criteriul salarial
        List<Employee> bigSalariesList = employeeList.stream()
                .filter(it -> it.getSalary() >= 30000)
                .toList();
        System.out.println(bigSalariesList);

        // Pas 2: Reducem sublista la primul angajat care respecta criteriul
        Optional<Employee> firstEmployee = bigSalariesList.stream()
                .findFirst();

        // Pas 3: Verificarea existentei angajatului
        if(firstEmployee.isPresent()) {
            System.out.println(firstEmployee.get());
        } else {
            throw new NoSuchElementException("Nu a fost gasit niciun angajat cu salariul >= 30000");
        }

        /* SOLUTIA COMPACTA */
        /*
        * La un stream elementul curent (iteratorul) se numeste PREDICAT, iar ceea ce este dupa '->' se numeste CONSUMATOR.
        * Ideea este ca PREDICATUL este utilizat de CONSUMATOR.
        *
        * In contextul folosirii unor metode pe obiectele structurii de date, vom folosi un PREDICAT sub forma de iterator,
        * care are scopul de a simboliza intr-o iteratie elementul curent, similar lui 'list.get(i)'.
        *
        * In contextul scrierii unor blocuri de cod individuale fara necesitatea unui PREDICAT, putem folosi 2 paranteze rotunde
        * ca si placeholder (ex. '()') si dupa sageata putem instantia intre acolade sau liber, linia sau liniile de cod.
        *
        * ATENTIE, acoladele ne permit sa introducem multiple linii de cod, in cazul neutilizarii acestora vom avea o singura linie!!!
        *
        * */
        Employee found = employeeList.stream()
                .filter(it -> it.getSalary() >= 30000)
                .findFirst()
                .orElseThrow(() -> {
                    throw new NoSuchElementException("Nu a fost gasit niciun angajat cu salariul >= 30000");
                    // alte linii de cod
                });
        System.out.println(found);
    }
}
