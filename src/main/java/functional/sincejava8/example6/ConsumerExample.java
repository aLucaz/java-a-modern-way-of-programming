package functional.sincejava8.example6;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.function.Consumer;

@Slf4j
public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // Los consumers no retornan nada, solo hacen una operacion con el elemento
        Consumer<Integer> consumer = e -> log.info(String.valueOf(e));

        list.forEach(consumer);
    }
}
