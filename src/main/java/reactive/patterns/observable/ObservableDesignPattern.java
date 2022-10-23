package reactive.patterns.observable;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObservableDesignPattern {
    public static void main(String[] args) {
        Book book = new Book(
            "little prince",
            "Horror",
            "Xyz",
            200,
            "SoldOut"
        );

        EndUser user1 = new EndUser("bob", book);
        EndUser user2 = new EndUser("earnl", book);

        log.info(book.getInStock());
        book.setInStock("In Stock");
    }
}
