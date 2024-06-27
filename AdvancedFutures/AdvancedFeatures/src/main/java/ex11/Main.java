package ex11;

/*
	In contextul utilizarii unor clase care au la baza o interfata,
	MEREU definim obiectul de tipul interfetei si il definim prin constructorul clasei
	care il implementeaza
 */

import ex10.Basket;
import ex10.GenericProduct;
import ex10.Product;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        // Definim date de test
        Product milk = new GenericProduct(() -> 56.0, it -> it.isAfter(LocalDate.now()));
        Product bread = new GenericProduct(() -> 12.0, it -> it.isAfter(LocalDate.of(2023, Month.MARCH, 14)));
        Product beer = new GenericProduct(() -> 13.0, it -> false);

        // Definim un cos de cumparaturi gol
        Basket shoppingCart = new Basket();

        // Adaugam produsele in cos
        shoppingCart.addProduct(milk);
        shoppingCart.addProduct(bread);
        shoppingCart.addProduct(beer);

        // Afisare produse dupa adaugare
        /* Varianta restransa cu streamuri */
        shoppingCart.retrieveBasket().forEach(it -> System.out.println(it.getPrice()));
        System.out.println();

        /* Varianta extinsa cu iterator */
        for(Product it: shoppingCart.getProductsInBasket()) {
            System.out.println(it.getPrice());
        }
        System.out.println();

        // Stergem bread
        shoppingCart.removeProduct(bread);

        // Afisare produse dupa stergere
        shoppingCart.retrieveBasket().forEach(it -> System.out.println(it.getPrice()));
        System.out.println();
    }
}
