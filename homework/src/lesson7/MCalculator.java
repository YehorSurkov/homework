package lesson7;

public class MCalculator {
    public int callCount;
    public int rawCount;
    public double[][] matrix;

    public MCalculator(double[][] mat) {
        rawCount = mat.length;
        callCount = mat[0].length;
        matrix = mat;
    }

    public MCalculator addMatrixes(MCalculator m) {
        if ((rawCount == m.matrix.length) && (callCount == m.matrix[0].length)) {
            MCalculator result = new MCalculator(new double[rawCount][callCount]);
            for (int i = 0; i < rawCount; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result.matrix[i][j] = matrix[i][j] + m.matrix[i][j];
                }
            }
            return result;
        } else {
            System.out.println("Wrong size");
            return new MCalculator(new double[1][1]);
        }
    }

    public MCalculator multToNumber(double alpha) {
        MCalculator result = new MCalculator(new double[rawCount][callCount]);
        for (int i = 0; i < rawCount; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.matrix[i][j] = matrix[i][j] * alpha;
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

    public static void showResult(MCalculator m) {
        for (double[] raw : m.matrix) {
            for (double el : raw) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
