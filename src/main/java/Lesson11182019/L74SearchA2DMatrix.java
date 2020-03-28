package Lesson11182019;

public class L74SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        } else {
            for (int i = matrix.length - 1; i >= 0; i--) {
                if (matrix[i][0] <= target) {
                    for (int i1 = 0; i1 < matrix[i].length; i1++) {
                        if (matrix[i][i1] == target) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}