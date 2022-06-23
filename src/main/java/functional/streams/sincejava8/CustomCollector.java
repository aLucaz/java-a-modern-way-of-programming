package functional.streams.sincejava8;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

@Slf4j
public class CustomCollector {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5, 7, 2, 3, 8, 9);
        // elements type, input list type, output collection type
        Collector<Integer, List<Integer>, List<Integer>> toList = Collector.of(
            ArrayList::new, //supplier
            List::add, // biconsumer
            (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            }, // bifunction
            Collector.Characteristics.IDENTITY_FINISH // characteristics
        );

        log.info(
            String.valueOf(
                numbers
                    .stream()
                    .filter(e -> e > 5)
                    .collect(toList)
            )
        );
    }
}
