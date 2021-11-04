/**
 * DP solution.
 *
 * Base cases:
 * if n <= 0, then the number of ways should be zero.
 * if n == 1, then there is only way to climb the stair.
 * if n == 2, then there are two ways to climb the stairs. One solution is one step by another; the other one is two steps at one time.
 *
 * Given a number of stairs n, if we know the number of ways to get to the points [n-1] and [n-2] respectively, denoted as n1 and n2 ,
 * then the total ways to get to the point [n] is n1 + n2. Because from the [n-1] point, we can take one single step to reach [n].
 * And from the [n-2] point, we could take two steps to get there.
 *
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println("Expected result: 5");
        System.out.println("Actual result: " + new ClimbingStairs().climbStairs(4));
    }

    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];

    }
}
