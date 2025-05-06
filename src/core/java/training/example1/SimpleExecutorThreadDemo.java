package core.java.training.example1;

import java.util.concurrent.*;

public class SimpleExecutorThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> callTask = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return 1000;
            }
        };

        ExecutorService pool = Executors.newSingleThreadExecutor();

        // Submit Runnable task
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is executing Runnable task");
            }
        };
        pool.execute(task);
        Future<Integer>result= pool.submit(callTask);
        System.out.println("result -->"+result.get());
        pool.shutdown();
        System.out.println("result -->"+result.get());

    }
}
