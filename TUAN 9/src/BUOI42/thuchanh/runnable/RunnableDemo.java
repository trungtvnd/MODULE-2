package BUOI42.thuchanh.runnable;

public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating" + threadName);
    }

    @Override
    public void run() {
        for (int i = 4; i >0 ; i--) {
            System.out.println("Thread: " + threadName + ", " + i );
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread" + threadName + "exiting");

    }
    public void start(){
        System.out.println("Starting" + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
