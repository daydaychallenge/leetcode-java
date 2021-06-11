package daydaychange.p00064;

public class MinimumPathSum {

    public static void main(String[] args) {
        MinimumPathSum sum = new MinimumPathSum();

        int s = sum.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
        System.out.println(s);

    }

    public int minPathSum(int[][] grid) {

        return helper(grid, 0, 0);
    }

    public int helper(int[][] grid, int i, int j) {
        if (i == grid.length - 1 && j == grid[i].length - 1) return grid[i][j];
        if (i == grid.length - 1) return grid[i][j] + helper(grid, i, ++ j);
        if (j == grid[i].length - 1) return grid[i][j] + helper(grid, ++ i, j);
        return grid[i][j] + Math.min(helper(grid, i + 1, j), helper(grid, i, j + 1));
    }

}
