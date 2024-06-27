package ex12;

/*
	Map = este o structura de date care se comporta ca o lista ce stocheaza perechi de tipul (cheie, valoare)
		- cheia este unica
		- valoarea este particulara si repetabila
	Cea mai simpla implementare a interfetei Map este HashMap, asa cum pentru List este ArrayList sau pentru Set este HashSet.
 */

import ex10.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ImprovedBasket {

    private final Map<Product, AtomicInteger> productsInBasket;

    public ImprovedBasket() {
        this.productsInBasket = new HashMap<>();
    }

    /*
    Avand in vedere ca utilizam o mapa, este nevoie ca in prima faza sa verificam unicitatea produsului.
    Ramura de adevar:
        1. Daca produsul exista, vom incrementa cantitatea existenta
    Ramura de fals:
        2. Daca produsul nu exista, vom adauga cantitatea propusa
     */
    public void addProduct(Product product, Integer quantity) {
        if (this.productsInBasket.containsKey(product)) {
            this.productsInBasket.get(product).getAndAdd(quantity);
        } else {
            this.productsInBasket.put(product, new AtomicInteger(quantity));
        }
    }

    /* Daca aveam un Map clasic -> Map<Product, Integer> productsInBasket. Cazul in care NU FOLOSIM AtomicInteger, ci Integer:
    private final Map<Product, Integer> productsInBasketNoAtomic;

    public ImprovedBasket() {
        this.productsInBasketNoAtomic = new HashMap<>();
    }
    public void addProductNoAtomic(Product product, Integer quantity) {
        if(this.productsInBasketNoAtomic.containsKey(product)) {
          	this.productsInBasketNoAtomic.put(product, this.productsInBasketNoAtomic.get(product) + quantity);
        } else {
            this.productsInBasketNoAtomic.put(product, quantity);
        }
    }
    */

    /*
    Avand in vedere ca utilizam o mapa, este nevoie sa verificam 2 conditii:
    	Conditia 1: sa existe produsul in mapa
    	Conditia 2: sa avem cantitatea respetiva in cosul de cumparaturi
    Ramura de adevar:
    	1. Stergem produsul
    Ramura de fals va verifica daca stergerea este partiala
    	2. Decrementam cu quantity sau Incrementam cu -quantity
     */
    public void removeProduct(Product product, Integer quantity) {
        if (this.productsInBasket.containsKey(product) && this.productsInBasket.get(product).get() <= quantity) {
            this.productsInBasket.remove(product);
        } else if (this.productsInBasket.containsKey(product)) {
            // Verificam cazul complementar in care cantitatea de sters este STRICT mai mica decat cantitatea exista
            	// && this.productsInBasket.get(product).get() > quantity
            this.productsInBasket.get(product).getAndAdd(-quantity); // value + (-quantity) = value - quantity
            // this.productsInBasketNoAtomic.put(product, this.productsInBasketNoAtomic.get(product) - quantity);
        }
    }

    public Map<Product, AtomicInteger> retrieveBasket() {
        return new HashMap<>(this.productsInBasket);
    }

    public Map<Product, AtomicInteger> getProductsInBasket() {
        return this.productsInBasket;
    }

    // Daca doriti sa spargeti mapa in 2:
    // 1. puteti prelua valorile din set folosind ".keySet()"
    // 2. puteti prelua valorile particulare folosind ".values()"
}


