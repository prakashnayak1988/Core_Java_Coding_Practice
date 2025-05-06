package core.java.training.stock;

import java.util.concurrent.*;

public class ScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable task = () -> System.out.println("Running at " + System.currentTimeMillis());

        // Start after 1 second, run every 2 seconds
        scheduler.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
    }
}

