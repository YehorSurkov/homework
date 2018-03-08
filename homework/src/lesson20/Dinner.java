package lesson20;

public class Dinner {
    public static void main(String[] args) {
        Spoon[] set = {new Spoon(), new Spoon(), new Spoon(), new Spoon(), new Spoon()};
        set[0].setTaken(true);
        set[1].setTaken(true);

        Philosopher ph1 = new Philosopher("Socrate", set[0], set[1]);
        Philosopher ph2 = new Philosopher("Platon", set[1], set[2]);
        Philosopher ph3 = new Philosopher("Aristote", set[2], set[3]);
        Philosopher ph4 = new Philosopher("Nietzsche", set[3], set[4]);
        Philosopher ph5 = new Philosopher("Goethe", set[4], set[0]);

        Thread t1 = new Thread(ph1);
        Thread t2 = new Thread(ph2);
        Thread t3 = new Thread(ph3);
        Thread t4 = new Thread(ph4);
        Thread t5 = new Thread(ph5);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println(t1.getName());
    }
}
