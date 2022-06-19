package functional.techniques.tco;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TailCallOptimization {
    public static void main(String[] args) {
        log.info(String.valueOf(refact(4)));
        // some compilers cannot convert typical recursion to iterative process
        // it is better to use a tail recursion whenever is possible
        // this is for saving space on the stack when we use recursion
        log.info(String.valueOf(tailrefact(4, 1)));
    }

    public static long refact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * refact(n - 1);
    }

    public static long tailrefact(int n, int a) {
        if (n <= 1) {
            return a;
        }
        return tailrefact(n - 1, n * a);
    }
}
