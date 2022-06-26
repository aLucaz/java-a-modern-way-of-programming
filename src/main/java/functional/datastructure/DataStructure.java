package functional.datastructure;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataStructure {
    public static void main(String[] args) {
        /*
         * A functional data structure is immutable: structure cannot be modified
         * persistent: preserve the previous state when an element is added
         * methods are referential transparent
         * is against destructive updates
         * */
        ListFun<Integer> myList = ListFun.list(1, 2, 3, 4, 5);
        myList.forEach(e -> log.info(String.valueOf(e)));
        log.info("=".repeat(10));
        ListFun<Integer> newList = myList.removeElem(3);
        newList.forEach(e -> log.info(String.valueOf(e)));
        log.info("=".repeat(10));
        ListFun<Integer> reversedList = myList.reverseList();
        reversedList.forEach(e -> log.info(String.valueOf(e)));
        log.info("=".repeat(10));
        ListFun<Integer> combinedList = myList.addAll(ListFun.list(6, 7, 8));
        combinedList.forEach(e -> log.info(String.valueOf(e)));
        log.info("=".repeat(20));
        QueueFun<String> q = QueueFun.queue();
        QueueFun<String> other = q.enqueue("nro1")
            .enqueue("nro2")
            .enqueue("nro3")
            .enqueue("nro4");
        other.forEach(log::info);
    }
}
