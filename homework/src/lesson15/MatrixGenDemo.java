package lesson15;

public class MatrixGenDemo {
    public static void main(String[] args) {
        Double[][] arr1 = {{0.1, 1.5}, {1.1, 2.3}};
        Integer[][] arr2 = {{1, 0}, {0, 1}};
        MatrixGen mG1 = new MatrixGen(arr1);
        MatrixGen mG2 = new MatrixGen(arr2);

        mG1.showResult();
        mG1.addMatrixes(mG1).showResult();

        mG2.multMatrixRight(mG1).showResult();
        mG2.multToNumber(3).showResult();
    }
}
