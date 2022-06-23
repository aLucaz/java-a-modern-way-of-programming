package functional.streams.state;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StateStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> collected = list.parallelStream()
            .skip(2) //stateful
            .limit(5) //stateful
            .collect(Collectors.toList());
        collected.forEach(val -> log.info(String.valueOf(val)));
        // stateless
        // performed one by one over the stream elements, not use outside information
        // stateful
        // uses outside information
        // difficult to process in parallel
        // not recommendable to use with parallelStream
    }
}
