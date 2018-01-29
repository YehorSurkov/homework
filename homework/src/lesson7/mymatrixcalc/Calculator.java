package lesson7.mymatrixcalc;

public class Calculator {
    int i;

    public void showMatrix(Matrix m) {
        for (double[] row : m.matrix) {
            for (double el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public Matrix multScalar(Matrix m, double alpha) {
        Matrix r = new Matrix(new double[m.rowCount][m.rowCount]);
        for (int i = 0; i < m.rowCount; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                r.matrix[i][j] = m.matrix[i][j] * alpha;
            }
        }
        return r;
    }

    public void multScalar(Matrix m, double alpha, String s) {
        showMatrix(multScalar(m, alpha));
    }

    public Matrix addition(Matrix m1, Matrix m2) {
        if (m1.rowCount == m2.rowCount && m1.colCount == m2.colCount) {
            Matrix r = new Matrix(new double[m1.rowCount][m1.rowCount]);
            for (int i = 0; i < m1.rowCount; i++) {
                for (int j = 0; j < m1.matrix[i].length; j++) {
                    r.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
                }
            }
            return r;
        } else {
            System.out.println("Fign'ya");
            return null;
        }
    }

    public void addition(Matrix m1, Matrix m2, String s) {
        showMatrix(addition(m1, m2));
    }

    public Matrix multiplication(Matrix m1, Matrix m2) {
        if (m1.colCount == m2.rowCount) {
            Matrix r = new Matrix(new double[m1.rowCount][m2.colCount]);
            for (int i = 0; i < m1.rowCount; i++) {
                for (int j = 0; j < m2.colCount; j++) {
                    r.matrix[i][j] = 0;
                    for (int cntr = 0; cntr < m1.colCount; cntr++)
                        r.matrix[i][j] += m1.matrix[i][cntr] * m2.matrix[cntr][j];
                }
            }
            return r;
        } else {
            System.out.println("Fign'ya");
            return null;
        }
    }

    public void multiplication(Matrix m1, Matrix m2, String s) {
        showMatrix(multiplication(m1, m2));
    }

    public double trace(Matrix m) {
        if (m.rowCount == m.colCount) {
            int tr = 0;
            for (int i = 0; i < m.colCount; i++) {
                tr += m.matrix[i][i];
            }
            return tr;
        } else {
            System.out.println("Fign'ya");
            return Double.NaN;
        }
    }

    public double determinant(Matrix m) {
        if (m.colCount == m.rowCount) {
            if (m.rowCount == 1) {
                return m.matrix[0][0];
            } else if (m.rowCount == 2) {
                return m.matrix[0][0] * m.matrix[1][1] - m.matrix[1][0] * m.matrix[0][1];
            } else {
                double det = 0;
                for (int i = 0; i < m.rowCount; i++) {
                    det += Math.pow(-1, i + 1 + 1) * m.matrix[0][i] * determinant(calcMinor(m, m.rowCount - 1));
                }
                return det;
            }
        } else {
            System.out.println("Fign'ya");
            return Double.NaN;
        }
    }

    public Matrix calcMinor(Matrix m, int col) {
        Matrix minor = new Matrix(new double[m.colCount - 1][m.colCount - 1]);
        for (int i = 1; i < m.colCount; i++) {
            int dj = 0;
            for (int j = 0; j < m.colCount - 1; j++) {
                if (j == col) {
                    dj = 1;
                } else {
                    minor.matrix[i - 1][j - dj] = m.matrix[i][j];
                }
            }
        }
        return minor;
    }
}
