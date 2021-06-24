package daydaychange.p00062;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        return helper(m, n, 1, 1);
    }

    private int helper(int m, int n, int i, int j) {
        if (i == m && j == n) return 1;
        if (i == m) {
            return helper(m, n, i, j + 1);
        }
        if (j == n) {
            return helper(m, n, i + 1, j);
        }
        return helper(m, n, i + 1, j) + helper(m, n, i, j + 1);
    }
}
