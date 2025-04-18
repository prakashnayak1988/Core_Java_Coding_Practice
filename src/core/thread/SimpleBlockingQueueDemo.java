package core.thread;

import java.util.concurrent.*;
public class SimpleBlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        // Producer
        new Thread(() -> {
            try {
                queue.put("A"); // OK
                System.out.println("Produced A");
                queue.put("B"); // OK
                System.out.println("Produced B");
                queue.put("C"); // Blocks until a consumer takes one
                System.out.println("Produced C");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Consumer
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Consumed " + queue.take());  // Unblocks producer
                Thread.sleep(1000);
                System.out.println("Consumed " + queue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}

