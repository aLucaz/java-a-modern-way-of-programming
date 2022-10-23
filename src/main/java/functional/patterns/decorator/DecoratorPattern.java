package functional.patterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorPattern {
    public static void main(String[] args) {
        Burger order = new BurgerShop(Burger::addCheese).use(new Burger());
        log.info(String.valueOf(order));
    }
}
