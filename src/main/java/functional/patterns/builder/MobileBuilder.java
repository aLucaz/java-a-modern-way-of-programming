package functional.patterns.builder;

import lombok.Data;

import java.util.function.Consumer;

@Data
public class MobileBuilder {
    private int ram;
    private int storage;
    private int battery;
    private int camera;
    private String processor;
    private double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> build) {
        build.accept(this);
        return this;
    }

    public Mobile create() {
        return new Mobile(this);
    }
}
