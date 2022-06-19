package functional.techniques.chaining;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T> consumer2) {
        return (T t) -> {
            this.accept(t);
            consumer2.accept(t);
        };
    }
}
