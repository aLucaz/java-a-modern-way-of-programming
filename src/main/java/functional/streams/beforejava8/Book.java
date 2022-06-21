package functional.streams.beforejava8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private String genre;
    private double rating;
}
