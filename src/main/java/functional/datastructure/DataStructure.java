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
    }
}
