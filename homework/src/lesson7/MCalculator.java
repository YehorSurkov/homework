package lesson7;

public class MCalculator {
    public int callCount;
    public int rawCount;
    public int[][] matrix;

    public MCalculator(int[][] mat) {
        rawCount = mat.length;
        callCount = mat[0].length;
        matrix = mat;
    }

    public int[][] addMatrixes(int[][] m) {
        if ((rawCount == m.length) && (callCount == m[0].length)) {
            int[][] r = new int[rawCount][callCount];
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    r[i][j] = matrix[i][j] + m[i][j];
                }
            }
            return r;
        } else {
            System.out.println("Wrong size");
            return new int[1][1];
        }
    }

    public int[][] multToNumber(int alpha) {
        int[][] r = new int[rawCount][callCount];
        for (int i = 0; i < rawCount; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                r[i][j] = alpha * matrix[i][j];
            }
        }
        return r;
    }

    public int[][] multMatrixRight(int[][] m) {
        if (callCount == m.length) {
            int[][] r = new int[rawCount][m[0].length];
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    r[i][j] = 0;
                    for (int cntr = 0; cntr < callCount; cntr++)
                        r[i][j] = r[i][j] + matrix[i][cntr] * m[cntr][j];
                }
            }
            return r;
        } else {
            System.out.println("Wrong size");
            return new int[1][1];
        }
    }
}
