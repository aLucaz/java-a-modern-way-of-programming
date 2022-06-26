package reactive;

public class Manifesto {
    public static void main(String[] args) {
        /*
        * modern systems should be:
        * - responsive (parallel, async)
        * - resilient
        * - elastic
        * - message driven
        * challenges:
        * - sync vs async
        * - callback hell (more callbacks, more difficulty for tracing and manage)
        * rxjava
        * - based on observer design pattern (push based)
        *   - subject: contains a state, if it changes, the subject notify all the observer
        *   - observer: registered to a subject
        * concepts
        *  - concurrent
        *       run multiple parts of a program in a single CPU, using different threads
        *       not necessary running at the same instant
        *       multitasking on a single core machine
        *  - parallel
        *       literally tasks running at the same time on a multicore processor
        * */
    }
}
