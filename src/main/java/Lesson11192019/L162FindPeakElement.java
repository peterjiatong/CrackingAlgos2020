package Lesson11192019;

public class L162FindPeakElement {
    public int findPeakElement(int[] nums) {

        if (nums.length == 2) {
            return nums[0] > nums[1] ? 0 : 1;
        } else if (nums.length == 1){
            return 0;
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (i != nums.length - 1 && i != 0) {
                    if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                        return i;
                    }
                } else if (i == 0) {
                    if (nums[i] > nums[i + 1]){
                        return i;
                    }
                }else
                if (nums[i] > nums[i - 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
