package functional.streams.sincejava8;

import functional.streams.beforejava8.Book;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StreamIntro {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("title", "me", "Horror", 4));
        books.add(new Book("title", "metoo", "Action", 2));

        log.info(
            String.valueOf(
                books.stream()
                    .filter(book -> book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3)
                    .collect(Collectors.toList())
            )
        );

        // streams are parallelizable, declarative and flexible, consice and readable
        // streams are not collections, are specialized iterators
        // streams do the iterations behind the scene

        log.info(
            String.valueOf(
                books.parallelStream()
                    .filter(book -> book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3)
                    .collect(Collectors.toList())
            )
        );
    }
}
