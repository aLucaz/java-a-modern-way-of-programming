package functional.patterns.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Consumer;

@Data
@AllArgsConstructor
public class CustomArrayList {
    private String[] elements;

    public void forEach(Consumer<String> action) {
        for (int i = 0; i < elements.length; i++) {
            action.accept(elements[i]);
        }
    }
}
