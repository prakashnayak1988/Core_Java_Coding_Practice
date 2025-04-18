package core.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueWithLambda {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        // Producer using lambda
        Runnable producer = () -> {
            String[] items = {"A", "B", "C"};
            try {
                for (String item : items) {
                    queue.put(item);
                    System.out.println("Produced: " + item);
                    Thread.sleep(500); // simulate production delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Consumer using lambda
        Runnable consumer = () -> {
            try {
                Thread.sleep(1000); // initial delay
                for (int i = 0; i < 3; i++) {
                    String item = queue.take();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(1000); // simulate processing
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Start threads
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

