package functional.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MapFunctionalOperations {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("9926878327", "John");
        contacts.put("9926878328", "Nea");
        contacts.put("9926878329", "Raju");
        contacts.put("9926878322", "Peter");
        contacts.forEach((k, v) -> log.info(k + " -> " + v));
    }
}
