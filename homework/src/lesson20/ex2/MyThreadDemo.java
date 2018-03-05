package lesson20.ex2;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread im = new MyThread(5, 100);

        Thread t1 = new Thread(im);
        Thread t2 = new Thread(im);
        Thread t3 = new Thread(im);

        t1.start();
        t2.start();
        t3.start();
    }
}
