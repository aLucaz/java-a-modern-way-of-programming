package functional.patterns.fluent;

import functional.techniques.composition.Function;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private List<String> cart;
    private String at;

    public Order() {
        this.cart = new ArrayList<>();
    }

    public Order addToCart(String product) {
        cart.add(product);
        return new Order(this.cart, this.at);
    }

    public Order deliveryAt(String at) {
        this.setAt(at);
        return new Order(this.cart, this.at);
    }

    public static Order place(Function<Order, Order> getOrder) {
        Order order = new Order();
        order = getOrder.apply(order);
        return order;
    }
}
