/*package Lesson11182019;

public class L278FirstBadVerison {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int check =0;
        while(check == 0){
            int middle = left + (right - left)/2;
            if (isBadVersion(middle)){
                right = middle;
            }else {
                left= middle+1;
            }
            if (left >= right){
                check +=1;
            }
        }
        return left;
    }
}
*/