package functional.beforejava8;

public class LambdaExample {

    public static void main(String[] args) {
        Runnable lambda = new CustomRunnable();
        Thread thread = new Thread(lambda);
        thread.start();
    }
}
