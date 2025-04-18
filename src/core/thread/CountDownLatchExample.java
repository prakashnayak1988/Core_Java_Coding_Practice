package core.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        int taskCount = 3;
        CountDownLatch latch = new CountDownLatch(taskCount);

        for (int i = 1; i <= taskCount; i++) {
            int taskId = i;
            new Thread(() -> {
                System.out.println("Task " + taskId + " is starting...");
                try {
                    Thread.sleep(1000 * taskId); // Simulate task duration
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " is done.");
                latch.countDown(); // Decrease latch count
            }).start();
        }

        System.out.println("Main thread waiting for tasks to complete...");
        latch.await(); // Wait until count becomes 0
        System.out.println("All tasks completed. Main thread proceeds.");
    }
}

