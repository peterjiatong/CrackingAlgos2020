/*package Lesson11182019;

public class L374GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 1;
        int right =n;
        int check = 2;
        int middle = 0;
        while(check != 0){
            middle = left + (right - left)/2;
            check = guess(middle);
            if (check == -1){
                right = middle-1;
            }else if(check == 1) {
                left = middle+1;
            }
        }
        return middle;

    }
}
*/