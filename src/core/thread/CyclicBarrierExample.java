package core.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {
        int threadCount = 3;
        CyclicBarrier barrier = new CyclicBarrier(threadCount, () -> {
            // This runs once all threads reach the barrier
            System.out.println("All threads have reached the barrier. Proceeding...");
        });

        for (int i = 1; i <= threadCount; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    System.out.println("Thread " + finalI + " is doing work...");
                    Thread.sleep(1000 * finalI); // simulate work
                    System.out.println("Thread " + finalI + " is waiting at the barrier");
                    barrier.await(); // wait for others
                    System.out.println("Thread " + finalI + " passed the barrier");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

