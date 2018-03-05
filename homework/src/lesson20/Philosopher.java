package lesson20;

public class Philosopher extends Thread {
    private String name;
    private Spoon leftSpoon;
    private Spoon rightSpoon;

    public Philosopher(String name, Spoon leftSpoon, Spoon rightSpoon) {
        this.name = name;
        this.leftSpoon = leftSpoon;
        this.rightSpoon = rightSpoon;
    }

    public void takeSpoon(Spoon spoon) {
        spoon.setTaken(true);
    }

    public void putSpoon(Spoon spoon) {
        if (spoon.equals(rightSpoon) && Math.random() > 0.5) {
            spoon.setTaken(false);
        } else {
            spoon.setTaken(false);
        }
    }

    @Override
    public synchronized void run() {
        takeSpoon(leftSpoon);
        rightSpoon.setTaken(true);
        while (true) {
            if (rightSpoon.isTaken()) {
                notify();
                System.out.println(name + " is mealing now.");
                putSpoon(rightSpoon);
                takeSpoon(rightSpoon);
            } else {
                putSpoon(leftSpoon);
                System.out.println(name + " has started thinking.");
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
