package daydaychange.p00695;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int ans = 0, n = grid.length, m = grid[0].length;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (grid[i][j] == 1) {
                    int count = markNum(grid, i, j, 0);
                    ans = Math.max(ans, count);
                }
            }
        }
        return ans;
    }

    private int markNum(int[][] grid, int i, int j, int count) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != 1) return count;
        grid[i][j] = 0;
        count ++;
        count = markNum(grid, i + 1, j, count);
        count = markNum(grid, i - 1, j, count);
        count = markNum(grid, i, j + 1, count);
        count = markNum(grid, i, j - 1, count);
        return count;
    }

}
