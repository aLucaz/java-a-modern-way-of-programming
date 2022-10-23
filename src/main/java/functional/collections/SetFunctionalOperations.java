package functional.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
public class SetFunctionalOperations {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(3, 45, 23, 1, 2, 56, 7);

        set.forEach(s -> log.info(String.valueOf(s)));

        log.info("=".repeat(10));

        set.stream()
            .filter(s -> s < 10)
            .forEach(s -> log.info(String.valueOf(s)));

        log.info("=".repeat(10));

        set.stream()
            .sorted()
            .forEach(s -> log.info(String.valueOf(s)));
    }
}
