package functional.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mobile {
    private final int ram;
    private final int storage;
    private final int battery;
    private final int camera;
    private final String processor;
    private final double screenSize;

    public Mobile(MobileBuilder mobileBuilder) {
        this.ram = mobileBuilder.getRam();
        this.storage = mobileBuilder.getStorage();
        this.battery = mobileBuilder.getBattery();
        this.camera = mobileBuilder.getCamera();
        this.processor = mobileBuilder.getProcessor();
        this.screenSize = mobileBuilder.getScreenSize();
    }
}
