package functional.streams.infinite;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class InfiniteStreams {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 1)
            .limit(5) // if we don't put this, it will iterate forever
            .forEach(v -> log.info(String.valueOf(v)));
    }
}
