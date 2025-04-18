package core.thread;

class Counter {
    private int count = 0;

    public synchronized int increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " is running. Count: " + count);
        return count;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
               var count= counter.increment();
                System.out.println("Count is -->"+count);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}