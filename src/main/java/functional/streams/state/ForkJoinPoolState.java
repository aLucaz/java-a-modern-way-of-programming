package functional.streams.state;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

@Slf4j
public class ForkJoinPoolState {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        log.info(String.valueOf(Runtime.getRuntime().availableProcessors()));
        System.setProperty(
            "java.util.concurrent.ForkJJoinPool.common.parallelism",
            "2"
        );
        log.info(String.valueOf(ForkJoinPool.getCommonPoolParallelism()));
        // main always require one thread
        // supose that machine has only 4 cores and only perform sequential operations
        // in my case are 16
        ForkJoinPool pool = new ForkJoinPool(2);
        long count = pool.submit(() ->
            List.of(1, 2, 3, 4, 5, 6).parallelStream()
                .filter(e -> e > 2)
                .count()
        ).get();
        log.info(String.valueOf(count));
        // RULES
        // for computational intensive operations; number of threats <= number of cores
        // for IO intensive operations: number of therats > number of cores
    }
}
