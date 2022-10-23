package functional.patterns.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ac {
    public void turnOn() {
        log.info("turn on");
    }

    public void turnOff() {
        log.info("turn off");
    }

    public void incTemp() {
        log.info("inc temp");
    }

    public void decTemp() {
        log.info("dec temp");
    }
}
