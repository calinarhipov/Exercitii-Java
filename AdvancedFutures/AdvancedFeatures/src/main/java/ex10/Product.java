package ex10;

/*
    Each item is an instance of Product interface that defines two methods,
    	-> one to get price of an item and
    	-> one to check for availability based on a provided date.
 */

/*
	Ce este o interfata?
		R: o interfata este un strat de abstractizare prin care definim un CONTRACT general al comportamentului unor clase

	Reguli:
		- definirea metodelor se face STRICT prin semnatura metodei -> NU AVEM CORPUL METODEI
		- nu este nevoie sa scriem modificatorul de acces in definitia semnaturii metodelor -> by default este PUBLIC
 */

import java.time.LocalDate;

public interface Product {
    double getPrice();

    boolean isAvailable(LocalDate productDate);
}
