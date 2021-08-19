package daydaychange.p00064;

public class MinimumPathSum {

    public static void main(String[] args) {
        MinimumPathSum sum = new MinimumPathSum();

        int s = sum.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
        System.out.println(s);

    }

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return helper(grid, 0, 0, dp);
    }

    public int helper(int[][] grid, int i, int j, int[][] dp) {
        if (i == grid.length - 1 && j == grid[i].length - 1) return grid[i][j];
        if (dp[i][j] != 0) return dp[i][j];
        if (i == grid.length - 1) return grid[i][j] + helper(grid, i, ++ j, dp);
        if (j == grid[i].length - 1) return grid[i][j] + helper(grid, ++ i, j, dp);
        int sum = grid[i][j] + Math.min(helper(grid, i + 1, j, dp), helper(grid, i, j + 1, dp));
        dp[i][j] = sum;
        return sum;
    }

}
