package Lesson11192019;


import javax.management.remote.JMXAddressable;

public class L74SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;


        while (left <= right) {
            int mid = (right + left) / 2;
            int i = mid/ matrix[0].length;
            int j = mid % matrix[0].length;

            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

