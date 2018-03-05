package lesson20.ex4;

public class Producer implements Runnable {

    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }


    @Override
    public void run() {
        while (true) {
            myQueue.put(myQueue.getObj());
        }
    }
}
