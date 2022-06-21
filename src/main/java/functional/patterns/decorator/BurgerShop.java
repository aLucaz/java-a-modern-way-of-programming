package functional.patterns.decorator;

import functional.techniques.composition.Function;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BurgerShop {
    Function<Burger, Burger> decoration;

    public BurgerShop(Function<Burger, Burger> decoration) {
        this.decoration = decoration;
    }

    public Burger use(Burger baseBurger) {
        log.info(String.valueOf(baseBurger));
        return decoration.apply(baseBurger);
    }

}
