package reactive.patterns.observable;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Data
@Slf4j
public class Book implements SubjectLibrary {
    private String name;
    private String type;
    private String author;
    private double price;
    private String inStock;
    private ArrayList<Observer> obsList = new ArrayList<>();

    public Book(String name,
                String type,
                String author,
                double price,
                String inStock) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public void setInStock(String inStock){
        this.inStock = inStock;
        log.info("Availability changed from Sold out to Back in stock");
        notifyObserver();
    }

    @Override
    public void subscribeObserver(Observer ob) {
        obsList.add(ob);
    }

    @Override
    public void unsubscribeObserver(Observer ob) {
        obsList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob: obsList){
            ob.update(this.inStock);
        }
    }
}
