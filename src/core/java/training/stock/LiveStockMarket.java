package core.java.training.stock;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class LiveStockMarket {

    private static final ConcurrentHashMap<String, AtomicReference<Double>> stockPrices = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        List<String> stocks = Arrays.asList("AAPLE", "GOOGLE", "MSFT", "AMZN", "TSLA");

        // Initialize random prices
        for (String stock : stocks) {
            stockPrices.put(stock, new AtomicReference<>(generateInitialPrice()));
        }

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(stocks.size() + 1);

        // Task to continuously update each stock's price
        for (String stock : stocks) {
            scheduler.scheduleAtFixedRate(() -> updateStockPrice(stock), 0, 2, TimeUnit.SECONDS);
        }

        // Separate task to fetch and print prices every 3 seconds
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("🔁 Current Stock Prices:");
            stockPrices.forEach((symbol, priceRef) -> {
                System.out.printf("%s: $%.2f%n", symbol, priceRef.get());
            });
            System.out.println("----------------------------");
        }, 0, 3, TimeUnit.SECONDS);
    }

    private static void updateStockPrice(String stock) {
        AtomicReference<Double> priceRef = stockPrices.get(stock);
        double oldPrice = priceRef.get();

        // Simulate price change (± $10)
        double change = (Math.random() - 0.5) * 20;
        double newPrice = Math.max(oldPrice + change, 1.0);
        priceRef.set(newPrice);
    }

    private static double generateInitialPrice() {
        return 100 + Math.random() * 900; // Between $100 and $1000
    }
}

