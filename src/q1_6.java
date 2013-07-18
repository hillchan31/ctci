/**
 *
 * @author hill
 */
public class q1_6 {

    public q1_6() {
    }

    public static int[][] rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - first - 1;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                //Save top
                int top = matrix[first][i];
                // left->top
                matrix[first][i] = matrix[last - offset][first];
                //bottom->left
                matrix[last - offset][first] = matrix[last][last - offset];
                //right->bottom
                matrix[last][last - offset] = matrix[i][last];
                //top->right
                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}
