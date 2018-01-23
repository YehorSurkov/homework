package lesson7;

public class MCalculator {
    private int callCount;
    private int rawCount;
    private double[][] matrix;

    public MCalculator(double[][] mat) {
        rawCount = mat.length;
        callCount = mat[0].length;
        matrix = mat;
    }

    public int getCallCount() {
        return callCount;
    }

    public void setCallCount(int callCount) {
        this.callCount = callCount;
    }

    public int getRawCount() {
        return rawCount;
    }

    public void setRawCount(int rawCount) {
        this.rawCount = rawCount;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public MCalculator addMatrixes(MCalculator m) {
        if ((rawCount == m.matrix.length) && (callCount == m.matrix[0].length)) {
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] += m.matrix[i][j];
                }
            }
            return this;
        } else {
            System.out.println("Wrong size");
            return new MCalculator(new double[1][1]);
        }
    }

    public MCalculator multToNumber(double alpha) {
        for (int i = 0; i < rawCount; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= alpha;
            }
        }
        return this;
    }

    public MCalculator multMatrixRight(MCalculator m) {
        if (callCount == m.matrix.length) {
            MCalculator r = new MCalculator(new double[rawCount][m.matrix[0].length]);
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < m.matrix[0].length; j++) {
                    r.matrix[i][j] = 0;
                    for (int cntr = 0; cntr < callCount; cntr++)
                        r.matrix[i][j] += matrix[i][cntr] * m.matrix[cntr][j];
                }
            }
            return r;
        } else {
            System.out.println("Wrong size");
            return new MCalculator(new double[1][1]);
        }
    }

    public void showResult(MCalculator m) {
        for (double[] raw : m.matrix) {
            for (double el : raw) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
