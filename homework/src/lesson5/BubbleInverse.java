package lesson5;

public class BubbleInverse {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 9, 7, 4, 0, 8};
        bubbleInv(arr);
        BubbleChanged.output(arr);
    }

    public static void bubbleInv(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
