package functional.sincejava8.example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaExample {
    public static void main(String[] args) {
        FuncInterface fun = () -> log.info("hello");
        fun.method();
    }
}
