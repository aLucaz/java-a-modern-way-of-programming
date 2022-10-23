package functional.datastructure;

import functional.techniques.chaining.Consumer;

public final class QueueFun<T> {

    private final ListFun<T> front;
    private final ListFun<T> rear;

    private QueueFun() {
        this.front = ListFun.list();
        this.rear = ListFun.list();
    }

    public static <T> QueueFun<T> queue() {
        return new QueueFun<>();
    }

    private QueueFun(QueueFun<T> queue, T element) {
        boolean frontIsEmpty = queue.front.isEmpty();
        this.front = frontIsEmpty ? queue.front.addfront(element) : queue.front;
        this.rear = frontIsEmpty ? queue.rear : queue.rear.addfront(element);
    }

    public QueueFun<T> enqueue(T t) {
        return new QueueFun<>(this, t);
    }

    private QueueFun(ListFun<T> front, ListFun<T> rear) {
        final boolean frontIsEmpty = front.isEmpty();
        this.front = frontIsEmpty ? rear.reverseList() : front;
        this.rear = frontIsEmpty ? front : rear;
    }

    public QueueFun<T> dequeue() {
        return new QueueFun<>(this.front.tail(), rear);
    }

    void forEach(Consumer<? super T> action) {
        T current = this.front.head();
        ListFun<T> temp = this.front.tail().addAll(this.rear.reverseList());
        while (temp != null) {
            action.accept(current);
            current = temp.head();
            temp = temp.tail();
        }
    }
}
