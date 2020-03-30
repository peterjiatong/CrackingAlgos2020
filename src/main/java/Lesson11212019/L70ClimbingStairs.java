package Lesson11212019;

public class L70ClimbingStairs {
    public int climbStairs(int n) {
    return findWays(0, n);
    }
    public int findWays(int a, int n) {

        if (a > n) {
            return 0;
        }
        if (a == n) {
            return 1;
        }
        return findWays(a + 1, n) + findWays(a + 2, n);
    }

}
