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
            int X = mid/ matrix[0].length;
            int Y = mid % matrix[0].length;

            if (matrix[X][Y] == target) {
                return true;
            } else if (matrix[X][Y] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
/*
if(matrix.length == 0 || matrix[0].length == 0){
        return false;
        }
        else {
        for (int i = matrix.length-1; i >= 0 ; i--) {
        if (matrix[i][0] <= target)
        {
        for (int i1 = 0; i1 < matrix[i].length; i1++) {
        if (matrix[i][i1] == target){
        return true;
        }
        }
        }
        }
        }
        return false;*/
