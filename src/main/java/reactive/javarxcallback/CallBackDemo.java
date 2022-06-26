package reactive.javarxcallback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CallBackDemo {
    public static void main(String[] args) throws InterruptedException {
        log.info("Main thread is running");
        Runnable r = () -> new CallBackDemo().runningAsync(1000, new CallBack() {
            @Override
            public void pushData(String data) {
                log.info("Callback push data " + data);
            }

            @Override
            public void pushComplete() {
                log.info("Callback completed");
            }

            @Override
            public void pushError(Exception exception) {
                log.info("Got an exception on callback: " + exception);
            }
        });
        Thread t = new Thread(r);
        t.start();
        Thread.sleep(2000);
        log.info("Main thread completed");
    }

    public void runningAsync(int after, CallBack callBack) {
        log.info("Hi from other thread");
        sleep(after);
        callBack.pushData("DATA1");
        callBack.pushData("DATA2");
        callBack.pushData("DATA3");
        callBack.pushError(new RuntimeException("AAAAAA ups"));
        callBack.pushComplete();
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
