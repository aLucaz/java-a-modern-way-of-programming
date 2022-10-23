package functional.techniques.closure;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Closure {
    public static void main(String[] args) {
        int value = 100;
        Task lambda = () -> {
            // you cannot change the value here
            log.info(String.valueOf(value));
            log.info("Task finished");
        };
        lambda.doTask();
    }
}
