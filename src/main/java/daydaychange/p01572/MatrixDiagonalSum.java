package daydaychange.p01572;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        if (mat == null || mat.length == 0) return sum;
        int m = mat.length;
        for (int i = 0; i < m; i++) {
            int pe = mat[i][i];
            sum += pe;
            int pI = m - i - 1;
            if (pI != i) {
                int se = mat[i][pI];
                sum += se;
            }
        }
        return sum;
    }

}
