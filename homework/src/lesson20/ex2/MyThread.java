package lesson20.ex2;

public class MyThread implements Runnable {
    private int divider;
    private int max;

    public MyThread(int divider, int max) {
        this.divider = divider;
        this.max = max;
    }

    public int getDivider() {
        return divider;
    }

    public void setDivider(int divider) {
        this.divider = divider;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void print() {
        for (int i = 1; i <= max; i++) {
            if (i % divider == 0) {
                System.out.println(i);
                resting();
            }
        }
    }

    public void resting() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        print();
    }
}
