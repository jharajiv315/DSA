import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    static void main() {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);

            }
            top++;
            if (top > bottom) break;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            
            right--;
            if(left <= right){

            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(top <= bottom){

            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);

            }
            left++;
            }
        }

        return result;
    }
}
