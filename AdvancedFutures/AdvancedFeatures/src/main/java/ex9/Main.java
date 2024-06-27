package ex9;

/*
    Based on employees list from exercise 7, using streams get a number representing
    maximum salary of all employees
 */

import ex7.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Declaratia statica a unei liste folosind constructori
        List<Employee> employeeList = new ArrayList<>(
                List.of(
                        new Employee(1, "Ion", 7000),
                        new Employee(2, "Ioana1", 12000),
                        new Employee(3, "Ioana2", 12000),
                        new Employee(4, "Matei1", 35000),
                        new Employee(5, "Matei2", 35000),
                        new Employee(6, "Maria1", 12000),
                        new Employee(7, "Maria2", 35000),
                        new Employee(8, "Maria3", 12000),
                        new Employee(9, "Maria4", 7000)
                )
        );
        System.out.println(employeeList);
        System.out.println();

        // HINT: INCERCARTI ITERATIV INTAI!!

        // Reducem lista la salariul maxim -> max
        /* insert your code */

        // Extrageti o sublista care are salariul maxim -> filter
        /* insert your code */
    }
}
