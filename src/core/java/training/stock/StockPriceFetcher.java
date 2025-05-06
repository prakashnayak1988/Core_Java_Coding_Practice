package core.java.training.stock;

import java.util.*;
import java.util.concurrent.*;

public class StockPriceFetcher {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Stock symbols
        List<String> stocks = Arrays.asList("APPLE", "GOOGLE", "AMAZON", "TESLA","XYZ","PQR");
        // Thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executor1 = Executors.newScheduledThreadPool(3);

        // List to hold Future results
        List<Future<String>> results = new ArrayList<>();

        for (String stock : stocks) {
            Callable<String> task = () -> {
                // Simulate delay in fetching stock price
                Thread.sleep(new Random().nextInt(3000) + 1000);
                double price = 100 + new Random().nextDouble() * 1000; // Mock price
                return stock + " price: $" + String.format("%.2f", price) + " (fetched by " + Thread.currentThread().getName() + ")";
            };

            Future<String> future = executor.submit(task);
            results.add(future);
            Future<String> futurescheduled = executor1.submit(task);
            results.add(futurescheduled);

            executor1.submit(task);
        }

        // Print results after all tasks complete
        for (Future<String> future : results) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}

