package functional.patterns.iterator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorPattern {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(new String[] {"1", "2", "3", "4", "5", "6"});
        list.forEach(log::info);
    }
}
