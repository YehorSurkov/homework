package lesson20.ex4;

public class Consumer implements Runnable {
    private MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            getTreadName();
            myQueue.get();
        }
    }

    public void getTreadName() {
        Thread th = new Thread();
        th = Thread.currentThread();
        System.out.println("is processed by " + th.getName());
    }
}
