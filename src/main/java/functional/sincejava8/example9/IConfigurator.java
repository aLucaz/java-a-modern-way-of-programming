package functional.sincejava8.example9;

public interface IConfigurator<T, R> {
    R configure(T item);
}
