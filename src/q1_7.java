/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class q1_7 {

    public q1_7() {
    }

    public static int[][] setZero(int[][] matrix) {
        if (matrix == null) {
            return null;
        }

        int row = matrix.length;
        int column = 0;
        if (row > 0) {
            column = matrix[0].length;
        }

        int[] rows = new int[row];
        int[] columns = new int[column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (0 == matrix[i][j]) {
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (1 == rows[i] || 1 == columns[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
