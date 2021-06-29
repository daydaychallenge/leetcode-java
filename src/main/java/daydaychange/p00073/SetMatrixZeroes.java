package daydaychange.p00073;

import java.util.Arrays;

public class SetMatrixZeroes {

//    public void setZeroes(int[][] matrix) {
//        if (matrix == null || matrix.length == 0) return;
//        boolean fr = false, fc = false;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == 0) {
//                    if (i == 0) fr = true;
//                    if (j == 0) fc = true;
//
//                    if ((i + j) != 0) {
//                        matrix[i][0] = 0;
//                        matrix[0][j] = 0;
//                    }
//
//                }
//            }
//        }
//        for (int i = 1; i < matrix.length; i++) {
//            if (matrix[i][0] == 0) {
//                for (int j = 0; j < matrix[0].length; j++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//        for (int j = 1; j < matrix[0].length; j++) {
//            if (matrix[0][j] == 0) {
//                for (int i = 0; i < matrix.length; i++) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//        if (fc) {
//            for (int i = 0; i < matrix.length; i++) {
//                matrix[i][0] = 0;
//            }
//        }
//
//        if (fr) {
//            Arrays.fill(matrix[0], 0);
//        }
//
//    }


    public void setZeroes(int[][] matrix) {
        setZeroes(matrix, 0, 0);
    }

    public void setZeroes(int[][] matrix, int row, int column) {
        int m = matrix.length;
        int n = matrix[m - 1].length;

        if (row >= m && column >= n) return;
        else if (column >= n) {
            row += 1;
            column = 0;
            if (row == m)
                return;
        }
        for (int r = row; r < m; r++) {
            for (int c = column; c < n; c++) {
                if (matrix[r][c] == 0) {
                    setZeroes(matrix, r, c + 1);
                    for (int r2 = 0; r2 < matrix.length; r2++)
                        matrix[r2][c] = 0;
                    Arrays.fill(matrix[r], 0);
                    return;
                }
            }
            column = 0;
        }
    }

}
