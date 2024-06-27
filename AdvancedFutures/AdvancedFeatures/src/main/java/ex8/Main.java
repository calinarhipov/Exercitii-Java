package ex8;

import ex7.Employee;

import java.util.ArrayList;
import java.util.List;

/*
    Based on employees list from previous exercise, using streams create new list with
    employees sorted by name.
* */

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

        // Sortarea dupa nume
        /*
        * Pentru sortarea cu streamuri a unor structuri de date (list) de tipul unei clase este nevoie sa definim un COMPARATOR.
        *
        * Acest comparator se poate face in 3 moduri:
        * 	1. fie definim o verificare conditionala folosind predicatul si consumatorul streamului (cazul de mai jos)
        * 		Cine sunt e1 si e2?
        * 			R: e1 si e2 reprezinta predicatul streamului de sortare, si scopul este de a fi iteratori pentru lista noastra de angajati
        * 			e1 si e2 functioneaza la fel ca i,j in cazul lui BubbleSort pentru iteratia celor 2 for-uri
        * 			unul este pentru controlul verificarilor -> e1
        * 			unul este pentru verificarea conditionala a elementelor comparate -> e2
        * 	2. fie folosim interfata Comparator cu metoda comparing si apelam referinta metodei getter getName -> ex. '.sorted(Comparator.comparing(Employee::getName))'
        * 	3. fie declaram un comparator predefinit in clasa de obiect Employee si folosim sorted fara niciun parametru sau comparator (https://www.geeksforgeeks.org/comparator-interface-java/)
        *
        * */
        List<Employee> sortedList = employeeList.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .toList();
        System.out.println(sortedList);
    }
}
