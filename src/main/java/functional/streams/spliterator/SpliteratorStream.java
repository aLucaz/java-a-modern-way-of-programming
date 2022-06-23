package functional.streams.spliterator;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class SpliteratorStream {
    public static void main(String[] args) {
        // spliterator
        // special object on which stream s built
        // interface to connect a stream on a custom source
        // an object to access the data which stream can use
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        Stream<Integer> stream = list.stream();
        Spliterator<Integer> spliterator = stream.spliterator();
        int bits = spliterator.characteristics();
        log.info(String.valueOf(Integer.bitCount(bits))); // 3 properties are set ORDERED SIZED SUBSIZED
        // characteristics in streams help to optimize innecesary operations
        TreeSet<Integer> tree = new TreeSet<>(list);
        tree.forEach(e -> log.info(String.valueOf(e)));
    }
}
