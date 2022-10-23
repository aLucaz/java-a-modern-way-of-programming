package functional.patterns.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Burger {
    private String type;

    public Burger() {
        this.type = "";
    }

    public Burger addCheese() {
        return new Burger(this.type + "Cheese");
    }
}
