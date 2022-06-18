package functional.sincejava8.example8;

import lombok.extern.slf4j.Slf4j;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

@Slf4j
public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> biFunction = String::concat;
        log.info(biFunction.apply("hello", " world"));
        IntBinaryOperator intBiFunction = Integer::sum;
        log.info(String.valueOf(intBiFunction.applyAsInt(1, 2)));
    }
}
