package lesson10.musicalshop;

public class Demo {
    public static void main(String[] args) {
        Instrument[] inst = {new Guitar(6), new Guitar(7), new Dram(2.2), new Trumpet(1.1)};

        for (Instrument in : inst) {
            in.play();
        }
    }
}
