package functional.techniques.composition;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Composition {
    public static void main(String[] args) {
        Function<Square, Integer> function1 = Square::getArea;
        Function<Integer, Double> function2 = Math::sqrt;
        Function<Square, Double> function3 = function2.compose(function1);
        log.info(String.valueOf(function3.apply(new Square(4))));
    }
}
