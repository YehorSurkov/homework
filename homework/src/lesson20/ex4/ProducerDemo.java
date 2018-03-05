package lesson20.ex4;

public class ProducerDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(new Integer(6));

        Consumer consumer1 = new Consumer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        Thread t11 = new Thread(consumer1);
        Thread t12 = new Thread(consumer2);
        Thread t2 = new Thread(producer);

        t11.start();
        t12.start();
        t2.start();
    }
}
