package functional.streams.beforejava8;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StreamIntro {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> horrorBooks = new ArrayList<>();

        books.add(new Book("title", "me", "Horror", 4));

        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3) {
                horrorBooks.add(book);
            }
        }

        log.info(String.valueOf(books));
        log.info(String.valueOf(horrorBooks));
    }
}
