package reactive.callback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CallBackDemo {
    public static void main(String[] args) throws InterruptedException {
        log.info("Main thread is running");
        Runnable r = () -> new CallBackDemo().runningAsync(1000, () -> log.info("Callback finish running async"));
        Thread t = new Thread(r);
        t.start();
        Thread.sleep(2000);
        log.info("Main thread completed");
    }

    public void runningAsync(int after, CallBack callBack) {
        log.info("Hi from other thread");
        sleep(after);
        callBack.call();
    }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
