package lesson15;

public class MinMax<T extends Number> {
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr.clone();
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public Number min() {
        Number min = arr[0].doubleValue();
        for (T el : arr) {
            if (min.doubleValue() > el.doubleValue()) {
                min = el.doubleValue();
            }
        }
        return min;
    }

    public double max() {
        double max = arr[0].doubleValue();
        for (T el : arr) {
            if (max < el.doubleValue()) {
                max = el.doubleValue();
            }
        }
        return max;
    }
}
