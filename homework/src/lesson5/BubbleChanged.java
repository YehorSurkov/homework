package lesson5;

public class BubbleChanged {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 4, 3, 9, 8};
        bubbleB(arr);
        output(arr);
    }

    public static void bubbleB(int[] arr) {
        int modification;
        int numberOfIteration = 0;
        for (int i = 0; i < arr.length; i++) {
            modification = 0;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                    modification += 1;
                }
            }
            numberOfIteration += modification;
            if (modification == 0) {
                break;
            }
        }
        System.out.println("Number of iterations = " + numberOfIteration + '\n');
    }

    public static void output(int[] arr) {
        for (int cntr = 0; cntr < arr.length; cntr++) {
            System.out.print(arr[cntr] + " ");
        }
    }
}

