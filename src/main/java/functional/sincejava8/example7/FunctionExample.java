package functional.sincejava8.example7;

import lombok.extern.slf4j.Slf4j;

import java.util.function.ToIntFunction;

@Slf4j
public class FunctionExample {
    public static void main(String[] args) {
        ToIntFunction<String> function = String::length;
        log.info(String.valueOf(function.applyAsInt("hola")));
    }
}
