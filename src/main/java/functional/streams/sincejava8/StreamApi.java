package functional.streams.sincejava8;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StreamApi {
    public static void main(String[] args) {
        // High Order Functions
        // takes one or more functions or
        // return a function or does both
        // examples: filter, map, reduce
        List<String> list = new ArrayList<>();
        list.add("arturo");
        list.add("jhamir");
        list.add("luca");
        list.add("ramo");
        list.add("huaman");
        log.info(
            String.valueOf(
                list.stream()
                    .map(String::length)
                    .collect(Collectors.toList())
            )
        );
        // streams are lazy
        // some collectors examples

        // also exists collector.joining
        log.info(
            String.join("", list)
        );

        log.info(
            String.valueOf(
                list.stream()
                    .collect(
                        Collectors.groupingBy(
                            e -> e.length() > 4, // can be replaced by a getter of object
                            Collectors.counting()
                        )
                    )
            )
        );
        // downstream collector

        log.info(
            String.valueOf(
                list.stream()
                    .collect(
                        Collectors.groupingBy(
                            e -> e.length() > 4,
                            Collectors.summingInt(String::length)
                        )
                    )
            )
        );

        log.info(
            String.valueOf(
                list.stream()
                    .collect(
                        Collectors.groupingBy(
                            e -> e.length() > 4,
                            Collectors.maxBy(
                                Comparator.comparing(
                                    String::length
                                )
                            )
                        )
                    )
            )
        );
    }
}
