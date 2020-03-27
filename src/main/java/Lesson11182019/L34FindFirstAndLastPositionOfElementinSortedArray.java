package Lesson11182019;

import java.util.Arrays;

public class L34FindFirstAndLastPositionOfElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] res = searchRange(nums, 8);

        System.out.println(res[0]);
        System.out.println(res[1]);
//        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    private static int searchindex(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        if (right == 0){
            if (nums[0] == target){
                return 0;
            }
        }
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target){
            return middle;
            }else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }


    private static int searchleft(int[] nums, int index, int target) {
        int left = 0;
        int right = index;

        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                if (nums[middle - 1] != target || middle == 0) {
                    return middle;
                } else {
                    right = middle - 1;
                }
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }


    private static int searchright(int[] nums, int index, int target) {
        int left = index;
        int right = nums.length-1;

        while (left < right) {
            int newmiddle = left + (right - left) / 2;
            if (nums[newmiddle] == target) {
                if (nums[newmiddle + 1] != target || newmiddle == nums.length - 1) {
                    return newmiddle;
                } else {
                    left = newmiddle + 1;
                }
            } else if (nums[newmiddle] < target) {
                left = newmiddle + 1;
            } else {
                right = newmiddle - 1;

            }
        }return right;
    }

    private static int[] searchRange(int[] nums, int target) {
        int index = searchindex(nums,target);
        if (index == -1) {
            return new int[]{-1,-1};
        }

        int left = searchleft(nums, index, target);
        int right = searchright(nums, index, target);
        return new int[]{left,right};
    }
}