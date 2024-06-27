package ex10;

/*
    Create a shop imitating application. Create Basket class that will allow for adding,
    removing and retrieving all items in the basket. Each item is an instance of Product
    interface that defines two methods, one to get price of an item and one to check for
    availability based on a provided date.

    Make sure that Basket does not expose it’s internal list storing products (meaning it will
    not return a reference to it’s internal list but rather a copy), all operations on that list
    should be done through Basket methods.
 */

/*
	Pasi de dezvoltare a unui sistem de back-end:
		1. definirea granulara a claselor componente si relatiile dintre ele:
			Basket -> Product -> GenericProduct
		2. atributele necesare clasei Basket:
			- o lista de produse unde sa putem SALVA sau STERGE elemente
		3. semnatura clasei
			- un constructor parametrizat pentru a putea intoarce un obiect instantiabil cu o serie de produse
			De ce?
				Daca am avea doar un constructor default, de fiecare data cand am incerca sa intoarcem un obiect cu o serie de produse salvate,
				ar trebui sa refacem procesul de set/get.
				Pe parcurs am putea face greseli si in loc sa salvam obiecte personalizate, am salva obiecte goale.
		4.
 */

import java.util.ArrayList;
import java.util.List;

public class Basket {
    // lista de produse pentru care vom defini comportamentul cerut
    // De ce e lista privata?
    	// R: Make sure that Basket does not expose it’s internal list storing products.
    private final List<Product> productsInBasket;

    // constructor default pentru initializarea unui obiect Basket GOL
    public Basket() {
        this.productsInBasket = new ArrayList<>();
    }

    // constructor parametrizat pentur initializarea unui obiect cu informatii existente
    // va fi util cand vom intoarce din baza de date cosuri de cumparaturi NENULE
    public Basket(List<Product> productsFromDb) {
        this.productsInBasket = productsFromDb;
    }

    // Comportamentul clasei
    /* Add an item */
    	// De ce nu ar fi ok o metoda statica? -> O metoda statica este independenta de clasa in care este definita, prin urmare nu ar avea nicio conexiune cu atributele si comportamentul intern al clasei obiect.
    		// Simplificare: Nu am putea accesa lista de produse, pentru ca ea face parte din obiectul clasei Basket, iar metoda fiind statica este INDEPENDENTA fata de acel obiect.
    public void addProduct(Product product) {
        this.productsInBasket.add(product);
    }

    /* Remove an item */
    public void removeProduct(Product product) {
        this.productsInBasket.remove(product);
    }

    /* Retrieve a COPY of the list */
    	// Ce este o copie a unui obiect/lista de obiect/variabile/orice?
    		// R: O copie este starea unei informatii de a coexista in doua locatii de memorie in paralel cu adrese (referinte) diferite.
    		// De ex: Zona de memorie A -> 0xff12, copia acestuia exist in zona de memorie B -> 0xfd15
    		// Ele au aceeasi informatie stocata, IN LOCATII DIFERITE. (una poate fi in clasa Main, alta poate fi in clasa de obiect)
    public List<Product> retrieveBasket() {
        return new ArrayList<>(this.productsInBasket);
    }

    // Getter Setter
    	// Un getter clasic intoarce o referinta a atributului din memoria clasei unde poate fi regasit obiectul in cauza.
    	// O referinta este adresa din memorie (nr in hexazecimal -> baza 16) la care gasim informatia.
    public List<Product> getProductsInBasket() {
        return this.productsInBasket;
    }
}
