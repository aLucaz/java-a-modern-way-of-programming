package functional.streams.parallel;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Slf4j
public class ParallelStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("elem1", "elem2", "elem3", "elem4");
        // seq
        List<String> res1 = list.stream().map(s -> {
            s = s.toUpperCase(Locale.ROOT);
            log.info(s);
            return s;
        }).collect(Collectors.toList());

        log.info(String.valueOf(res1));

        log.info("=".repeat(100));
        // parallel
        List<String> res2 = list.parallelStream().map(s -> {
            s = s.toUpperCase(Locale.ROOT);
            log.info(s);
            return s;
        }).collect(Collectors.toList());

        log.info(String.valueOf(res2));
    }
}
