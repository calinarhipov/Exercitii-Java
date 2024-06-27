package ex13;

import ex10.GenericProduct;
import ex10.Product;
import ex12.ImprovedBasket;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Definim date de test
        Product milk = new GenericProduct(() -> 56.0, it -> it.isAfter(LocalDate.now()));
        Product bread = new GenericProduct(() -> 12.0, it -> it.isAfter(LocalDate.of(2023, Month.MARCH, 14)));
        Product beer = new GenericProduct(() -> 13.0, it -> false);

        // Definim un cos de cumparaturi gol
        ImprovedBasket shoppingCart = new ImprovedBasket();

        // Adaugam produsele in cos
        shoppingCart.addProduct(milk, 2);
        shoppingCart.addProduct(bread, 5);
        shoppingCart.addProduct(beer, 3);

        // Definim serviciul
        OrderService orderService = new OrderService();

        // Calculam pretul total
        System.out.println(orderService.calculateTotalPriceWithStreams(shoppingCart));
        System.out.println(orderService.calculateTotalPriceIteratively(shoppingCart));
    }
}
