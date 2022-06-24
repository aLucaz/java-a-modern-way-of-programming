package functional.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class ListFunctionalOperations {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Avengers 4", 2018, "Hollywood"),
            new Movie("Avengers 3", 2017, "Hollywood"),
            new Movie("Avengers 2", 2016, "Bollywood"),
            new Movie("Avengers", 2015, "Bollywood")
        );

        movies.sort(Comparator.comparingInt(Movie::getYear));
        movies.forEach(e -> log.info(String.valueOf(e)));

        movies.stream()
            .map(Movie::getName)
            .forEach(log::info);

        log.info(
            String.valueOf(
                movies.stream()
                    .map(Movie::getName)
                    .reduce((prev, curr) -> prev + ", " + curr)
            )
        );
    }
}
