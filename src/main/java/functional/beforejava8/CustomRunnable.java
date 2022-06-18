package functional.beforejava8;

public class CustomRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread executed!");
    }
}
