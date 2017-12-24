package lesson5;

public class SortMod {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 6, 10, 43, 1, 0, 46};
        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            if (pos != i) {
                array[pos] = array[i];
                array[i] = min;
            }
        }
        BubbleChanged.output(array);
    }
}
