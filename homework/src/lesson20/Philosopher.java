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
        if (!spoon.isTaken()) {
            spoon.setTaken(true);
        }
    }

    public void putSpoon(Spoon spoon) {
        if (spoon.isTaken() && Math.random() < 0.5) {
            spoon.setTaken(false);
        }
    }

    @Override
    public void run() {
        while (true) {
            takeSpoon(rightSpoon);
            takeSpoon(leftSpoon);
            if (rightSpoon.isTaken() && leftSpoon.isTaken()) {
                System.out.println(name + "'s eating");
            } else {
                System.out.println(name + "'s thinking");
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            putSpoon(rightSpoon);
            putSpoon(leftSpoon);
        }
    }
}
