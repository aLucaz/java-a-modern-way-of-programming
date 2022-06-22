package functional.streams.numeric;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
public class NumericStream {
    public static void main(String[] args) {
        List<Integer> normalList = new ArrayList<>();
        normalList.add(10);
        normalList.add(20);
        normalList.add(30);
        normalList.add(40);
        // map only receive Integer
        List<Integer> result = normalList.stream().map(integer -> integer / 10).collect(Collectors.toList());
        result.forEach(value -> log.info(String.valueOf(value)));
        // mapToInt receibe int retrieve intStream and can be used in the next operation
        normalList.stream().mapToInt(integer -> integer / 10).forEach(value -> log.info(String.valueOf(value)));
        // numeric streams
        IntStream ints = IntStream.of(1, 2, 3, 4);
        Stream<Integer> boxed = ints.boxed();
        log.info(String.valueOf(boxed.collect(Collectors.toList())));

        IntStream intstoo = IntStream.of(1, 2, 3, 4);
        log.info(String.valueOf(intstoo.average()));
        //I CANNOT do an operation again, cause the stream has already been operated
        //log.info(String.valueOf(ints.min()));
    }
}
