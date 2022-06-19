package functional.sincejava8.example9;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HighOrderFunctionExample {
    public static void main(String[] args) {
        IFactory<Integer> factory = createFactory(
            () -> Math.random() * 1000,
            Double::intValue
        );
        log.info(String.valueOf(factory.create()));
    }

    public static <T, R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T, R> configurator) {
        return () -> {
            T item = producer.produce();
            return configurator.configure(item);
        };
    }
}
