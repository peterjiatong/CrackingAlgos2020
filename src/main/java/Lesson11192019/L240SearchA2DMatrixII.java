package Lesson11192019;

public class L240SearchA2DMatrixII {

    public static void main(String[] args) {
        int [] [] matrix = new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        searchMatrix(matrix,5);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        } else {
            for (int i = matrix.length - 1; i >= 0; i--) {
                if (matrix[i][0] <= target) {
                    for (int i1 = 0; i1 < matrix[i].length; i1++) {
                        if(matrix[i][i1] > target && i != 0) {
                            i--;
                            i1--;
                        }
                        else if (matrix[i][i1] == target) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }
}
