package daydaychange.p00304;

/**
 * https://leetcode.com/problems/range-sum-query-2d-immutable/
 * 304. Range Sum Query 2D - Immutable
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 *
 * Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * Implement the NumMatrix class:
 *
 * NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
 * int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle
 * defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 *
 *
 * Constraints:
 *
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 200
 * -105 <= matrix[i][j] <= 105
 * 0 <= row1 <= row2 < m
 * 0 <= col1 <= col2 < n
 * At most 104 calls will be made to sumRegion.
 *
 */
public class NumMatrix {

    private final int[][] m;

    public static void main(String[] args) {
        NumMatrix matrix = new NumMatrix(new int[][]{{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}});
        int s1 = matrix.sumRegion(2,1,4,3);
        int s2 = matrix.sumRegion(1,1,2,2);
        int s3 = matrix.sumRegion(1,2,2,4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public NumMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 1; j < matrix[i].length; j ++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        this.m = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i ++) {
            if (col1 == 0) sum += m[i][col2];
            else sum += m[i][col2] - m[i][col1 - 1];
        }
        return sum;
    }
}
