package functional.sincejava8.example3;

import lombok.extern.slf4j.Slf4j;

import java.util.OptionalInt;
import java.util.stream.IntStream;

@Slf4j
public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        // imperative: how to do

        int sumEven = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        log.info(String.valueOf(sumEven));

        // declarative or functional: what to do

        OptionalInt sumOpt = IntStream.rangeClosed(0, 100).filter(i -> (i % 2) == 0).reduce(Integer::sum);
        if (sumOpt.isPresent()) {
            log.info(String.valueOf(sumOpt.getAsInt()));
        }

    }
}
