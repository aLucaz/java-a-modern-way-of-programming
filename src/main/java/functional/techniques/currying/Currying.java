package functional.techniques.currying;

import functional.techniques.composition.Function;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Currying {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> function1 = i -> v -> i + v;
        log.info(String.valueOf(function1.apply(4).apply(2)));
    }
}
