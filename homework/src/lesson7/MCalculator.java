package lesson7;

public class MCalculator {
    int callCount;
    int rawCount;
    int[][] matrix;

    void addMatrixes(int[][] m) {
        if ((rawCount == m.length) && (callCount == m[0].length)) {
            int[][] r = new int[rawCount][callCount];
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    r[i][j] = matrix[i][j] + m[i][j];
                }
            }
            showResult(r);
        } else {
            System.out.println("Wrong size");
        }
    }

    void multToNumber(int alpha) {
        int[][] r = new int[rawCount][callCount];
        for (int i = 0; i < rawCount; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                r[i][j] = alpha * matrix[i][j];
            }
        }
        showResult(r);
    }

    void multMatrixRight(int[][] m) {
        if ((callCount == m.length)) {
            int[][] r = new int[rawCount][m[0].length];
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    r[i][j] = 0;
                    for (int cntr = 0; cntr < callCount; cntr++)
                        r[i][j] = r[i][j] + matrix[i][cntr] * m[cntr][j];
                }
            }
            showResult(r);
        } else {
            System.out.println("Wrong size");
        }
    }

    void showResult(int[][] res) {
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    MCalculator(int[][] mat) {
        rawCount = mat.length;
        callCount = mat[0].length;
        matrix = mat;
    }
}
