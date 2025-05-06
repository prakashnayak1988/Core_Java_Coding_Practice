package core.java.training;

public class MultiThreadingDemo {
    public static void main(String [] args) {
        ThreadClassDemo thread = new ThreadClassDemo();
        thread.start();

// Using Runnable Interface
        RunnableInterfaceDemo ri = new RunnableInterfaceDemo();
        Thread th = new Thread(ri);
        th.start();


    }
}
