package functional.patterns.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryPattern {
    public static void main(String[] args) {
        // example Calendar.getInstance()
        Flooring flooring = FlooringFactory.getFlooring(-1, 18);
        log.info(String.valueOf(flooring));
        flooring.installation();
    }
}
