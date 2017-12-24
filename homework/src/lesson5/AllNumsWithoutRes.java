package lesson5;

public class AllNumsWithoutRes {
    public static void main(String[] args) {
        int cntr = 1;
        float line = 0;
        do {
            if (cntr % 5 == 0) {
                System.out.print(cntr + " ");
                line++;
            }
            cntr++;
        } while (cntr <= 100);
    }
}
