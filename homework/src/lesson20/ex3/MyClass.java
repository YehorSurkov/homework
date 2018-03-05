package lesson20.ex3;

public class MyClass extends Thread {
    private StringBuilder sb;

    public MyClass(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        mySyncMethod();
    }

    private void mySyncMethod() {
        synchronized (sb) {
            for (int i = 0; i < 100; i++) {
                System.out.println(sb.charAt(0) + " " + (i + 1));
            }
            sb.setCharAt(0, (char) (sb.charAt(0) + 1));
        }
    }
}
