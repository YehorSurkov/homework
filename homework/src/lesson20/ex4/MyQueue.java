package lesson20.ex4;

import java.util.Queue;

public class MyQueue<T> {
    private Queue<T> obj;

    public MyQueue(Queue<T> obj) {
        this.obj = obj;
    }

    public Queue<T> getObj() {
        return obj;
    }

    public void setObj(Queue<T> obj) {
        this.obj = obj;
    }

    public synchronized Queue<T> get() {
        System.out.println("Got " + obj.toString());
        return obj;
    }


    public synchronized void put(Object obj2) {
        this.obj = (Queue<T>) obj2;
        System.out.println("Sent " + obj.toString());
    }
}
