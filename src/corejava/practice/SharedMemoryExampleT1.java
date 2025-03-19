package corejava.practice;

class SharedMemoryExample {
    private int sharedValue = 0;

    public synchronized void increment() {
        sharedValue++;
    }

    public synchronized int getSharedValue() {
        return sharedValue;
    }
}

public class SharedMemoryExampleT1 {
    public static void main(String[] args) {
        SharedMemoryExample sharedMemory = new SharedMemoryExample();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedMemory.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedMemory.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Shared Value: " + sharedMemory.getSharedValue());
    }
}
