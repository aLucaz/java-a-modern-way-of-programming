package functional.patterns.fluent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FluentPattern {
    public static void main(String[] args) {
        Order myorder = new Order();
        myorder.addToCart("shoes");
        myorder.addToCart("yogurt");
        myorder.deliveryAt("here");
        log.info(String.valueOf(myorder));
        Order otherOrder = new Order();
        otherOrder.addToCart("more shoes").addToCart("more yogurt").deliveryAt("here");
        log.info(String.valueOf(otherOrder));

        log.info(String.valueOf(Order.place((order) -> {
            order.addToCart("more shoes").addToCart("more yogurt").deliveryAt("here");
            return order;
        })));
    }
}
