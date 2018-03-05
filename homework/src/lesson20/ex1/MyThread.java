package lesson20.ex1;

public class MyThread extends Thread {
    @Override
    public void run() {
        this.setName("Yehorka");
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " is working now:)");
        }
    }
}
