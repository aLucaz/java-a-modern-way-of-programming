package functional.streams.sincejava8;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
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
        list.add("hola1");
        list.add("hola2");
        list.add("hola3");
        list.add("hola4");
        list.add("hola5");
        log.info(
            String.valueOf(
                list.stream()
                    .map(String::length)
                    .collect(Collectors.toList())
            )
        );
        // streams are lazy
    }
}
