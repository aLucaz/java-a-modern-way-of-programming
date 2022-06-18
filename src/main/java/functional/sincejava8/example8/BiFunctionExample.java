package functional.sincejava8.example8;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BiFunction;

@Slf4j
public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, String, Integer> biFunction = (a, b) -> a * b.length();
        log.info(String.valueOf(biFunction.apply(2, " world")));
    }
}
