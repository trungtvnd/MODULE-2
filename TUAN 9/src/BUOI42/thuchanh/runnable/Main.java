package BUOI42.thuchanh.runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunnableDemo runnableDemo = new RunnableDemo("Thread 1 Database");
        runnableDemo.run();
        runnableDemo.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.run();
        System.out.println("Main thread stopped!!! ");

    }
}
