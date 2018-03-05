package lesson20.ex4;

public class MyQueue<T> {
    private T obj;

    public MyQueue(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public synchronized T get() {
        System.out.println("Got " + obj.toString());
        return obj;
    }


    public synchronized void put(Object obj2) {
        this.obj = (T) obj2;
        System.out.println("Sent " + obj.toString());
    }
}
