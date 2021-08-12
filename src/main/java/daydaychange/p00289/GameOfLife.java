package daydaychange.p00289;

/**
 * https://leetcode.com/problems/game-of-life/
 * 289. Game of Life
 * According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * <p>
 * The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 * <p>
 * Any live cell with fewer than two live neighbors dies as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population.
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 25
 * board[i][j] is 0 or 1.
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Could you solve it in-place? Remember that the board needs to be updated simultaneously: You cannot update some cells first and then use their updated values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches upon the border of the array (i.e., live cells reach the border). How would you address these problems?
 */
public class GameOfLife {

    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int numOfLives = countLives(board, i, j);
                if (board[i][j] == 1) {
                    if (numOfLives > 3 || numOfLives < 2) {
                        board[i][j] = 3;
                    } else {
                        board[i][j] = 1;
                    }
                } else {
                    if (numOfLives == 3 && board[i][j] == 0) {
                        board[i][j] = 2;
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 3) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public int countLives(int[][] board, int i, int j) {
        int countLiveOnes = 0;
        if (i > 0 && (board[i - 1][j] == 1 || board[i - 1][j] == 3)) {
            countLiveOnes++;
        }
        if (i < board.length - 1 && (board[i + 1][j] == 1 || board[i + 1][j] == 3)) {
            countLiveOnes++;
        }

        if (j > 0 && (board[i][j - 1] == 1 || board[i][j - 1] == 3)) {
            countLiveOnes++;
        }

        if (j < board[0].length - 1 && (board[i][j + 1] == 1 || board[i][j + 1] == 3)) {
            countLiveOnes++;
        }

        if (i > 0 && j > 0 && (board[i - 1][j - 1] == 1 || board[i - 1][j - 1] == 3)) {
            countLiveOnes++;
        }

        if (i > 0 && j < board[0].length - 1 && (board[i - 1][j + 1] == 1 || board[i - 1][j + 1] == 3)) {
            countLiveOnes++;
        }

        if (i < board.length - 1 && j > 0 && (board[i + 1][j - 1] == 1 || board[i + 1][j - 1] == 3)) {
            countLiveOnes++;
        }

        if (i < board.length - 1 && j < board[0].length - 1 && (board[i + 1][j + 1] == 1 || board[i + 1][j + 1] == 3)) {
            countLiveOnes++;
        }
        return countLiveOnes;
    }

}
