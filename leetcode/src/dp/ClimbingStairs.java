package dp;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 * @author kevinliu
 * @Solution DP Function: f[n] = f[n-1] + f[n-2]
 * 
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
		int[] ret = new int[n + 1];
		ret[0] = 1;
		ret[1] = 1;
		for (int i = 2; i <= n; i++) {
			ret[i] = ret[i - 1] + ret[i - 2];
		}
		return ret[n];
    }
}
