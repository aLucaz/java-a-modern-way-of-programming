package functional.patterns.factory;

import java.util.function.Supplier;

public class FlooringFactory {
    public static Flooring getFlooring(int minTemp, int maxTemp) {
        Supplier<Flooring> flooringSupplier;
        if (minTemp <= 5 && maxTemp <= 20) {
            flooringSupplier = Wooden::new;
        } else if (minTemp <= 5 && maxTemp >= 45) {
            flooringSupplier = Cork::new;
        } else {
            flooringSupplier = Concrete::new;
        }
        return flooringSupplier.get();
    }
}
