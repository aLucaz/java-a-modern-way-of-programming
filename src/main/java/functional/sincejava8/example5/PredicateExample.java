package functional.sincejava8.example5;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
public class PredicateExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("basics");
        list.add("");
        list.add("strong");
        list.add("");

        Predicate<String> predicate = s -> !s.isEmpty();

        List<String> filteredList = list.stream().filter(predicate).collect(Collectors.toList());

        log.info(String.valueOf(filteredList));
    }
}
