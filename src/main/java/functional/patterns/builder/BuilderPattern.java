package functional.patterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderPattern {
    public static void main(String[] args) {
        // examples: StringBuilder and StringBuffer
        MobileBuilder builder = new MobileBuilder();
        builder.with(mybuilder -> {
            mybuilder.setRam(4);
            mybuilder.setStorage(4);
            mybuilder.setBattery(4);
            mybuilder.setCamera(4);
            mybuilder.setProcessor("Snapdragon");
            mybuilder.setScreenSize(14.3);
        });
        log.info(String.valueOf(builder.create()));
    }
}
