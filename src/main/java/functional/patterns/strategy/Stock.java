package functional.patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Stock {
    private String company;
    private double price;
    private int number;
}
