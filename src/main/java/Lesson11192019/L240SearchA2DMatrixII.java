package Lesson11192019;

public class L240SearchA2DMatrixII {

    public static void main(String[] args) {
        int [] [] matrix = new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(matrix, 5));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0 || matrix == null ||  matrix[0] == null ) {
            return false;
        }

        int n = matrix.length-1;
        int m= matrix[0].length;
        int i = n;
        int j = 0;

        while (i >= 0 && j < m){
            if (matrix[i][j] == target)return true;
            else if(matrix[i][j] > target) i--;
            else j++;
        }
        return false;

    }
}
