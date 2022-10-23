package functional.sincejava8.example4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Practice {

    public static void main(String[] args) {
        MathOperation add = (a, b) -> log.info(String.valueOf(a + b));
        add.operation(1, 2);
    }
}
