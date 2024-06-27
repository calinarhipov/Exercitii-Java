package ex13;

import ex10.Product;
import ex12.ImprovedBasket;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/*
    Create OrderService class that accepts instance of the Basket class from exercise 12 and
    returns total price for all the items in the Basket that are available.

    Remember about quantity - you will have to improve Basket class again. Use streams.
 */

public class OrderService {

    public Double calculateTotalPriceIteratively(ImprovedBasket shoppingCart) {
        double totalSum = 0;

        for(Map.Entry<Product, AtomicInteger> it: shoppingCart.retrieveBasket().entrySet()) {
            totalSum = totalSum + it.getKey().getPrice() * it.getValue().get();
        }

        return totalSum;
    }

    public Double calculateTotalPriceWithStreams(ImprovedBasket shoppingCart) {
        return shoppingCart.retrieveBasket().entrySet()
                .stream()
                .map(it -> it.getKey().getPrice() * it.getValue().get())
                .reduce(0.0, Double::sum);
    }

}
