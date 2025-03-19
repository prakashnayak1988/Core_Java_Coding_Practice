import java.util.concurrent.*;

public class ConcurrentHashMapMultiThreading {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Create multiple threads that modify the map concurrently
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                map.put(i, "Value " + i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 6; i <= 10; i++) {
                map.put(i, "Value " + i);
            }
        };

        executor.execute(task1);
        executor.execute(task2);

        // Wait for tasks to finish
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        // Print final map content
        System.out.println("Final Map: " + map);
    }
}
