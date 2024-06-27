package ex10;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.Function;
import java.util.function.Supplier;

/*
    Create GenericProduct class that implements Product interface and will have supplier
    supplying price and function checking availability based on a provided date for a
    particular product.
 */

/*
	Programarea functionala:
		- este o paradigma de programare (standard) prin care scrierea codului este bazata pe implementarea unor metode matematice
		axate pe transformarea statutului de la input la output
		- prin metode matematice ne referim la streamuri
		- este realizata de o serie de INTERFETE FUNCTIONALE

	Interfete functionale:
		- sunt niste clase in Java care definesc o serie de metode contractuale -> Supplier si Function
		- se axeaza pe implementarea codului folosind expresiile lambda -> streamuri
		- interfata functionala se comporta ca un INVELIS (WRAPPER) peste tipul de date al atributului pe care il va intoarce metoda in cauza
		- in definitia implmentarii metodelor functionale, pur si simplu apelam metodele din contract GET, respectiv APPLY
			-> in main definim regulile.
 */

public class GenericProduct implements Product {

    // Supplier = este o interfata functionala care seteaza o regula de intoarcere a unui rezultat dinamic
    // primim T -> intoarcem T => Supplier<T> -> T
    private final Supplier<Double> price;

    // Function = este o interfata functionala care seteaza o regula de primire a unui input si transformare a acestuia in alt output
    // primit T -> intoarce R => Function<T,R> -> R
    private final Function<LocalDate, Boolean> availability;

    public GenericProduct(Supplier<Double> price, Function<LocalDate, Boolean> availability) {
        this.price = price;
        this.availability = availability;
    }

    @Override
    public double getPrice() {
        return this.price.get();
    }

    @Override
    public boolean isAvailable(LocalDate productDate) {
        return this.availability.apply(productDate);
    }

    public boolean isAvailable2(LocalDate productDate) {
        if (productDate.isAfter(LocalDate.now()))
            return true;
        return false;
    }

    public boolean isAvailable3(LocalDate productDate) {
        if (productDate.isAfter(LocalDate.of(2023, Month.MARCH, 14)))
            return true;
        return false;
    }

    public boolean isAvailable4(LocalDate productDate) {
        if (productDate.isAfter(LocalDate.now()))
            return true;
        else if (productDate.isAfter(LocalDate.of(2023, Month.MARCH, 14)))
            return true;
        return false;
    }
}
