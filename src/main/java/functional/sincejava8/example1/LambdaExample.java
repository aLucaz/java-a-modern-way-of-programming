package functional.sincejava8.example1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> log.info("lambda executed"));
        t.start();
    }
}
