package functional.techniques.chaining;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chaining {
    public static void main(String[] args) {
        Consumer<String> consumer1 = log::info;
        Consumer<String> consumer2 = log::info;
        consumer1.accept("hello");
        consumer2.accept("hello");
        Consumer<String> consumer3 = s -> {
            consumer1.accept(s);
            consumer2.accept(s);
        };
        consumer3.accept("aea");
        Consumer<String> consumer4 = consumer1.thenAccept(consumer2).thenAccept(consumer3);
        consumer4.accept("WHAT");
    }
}
