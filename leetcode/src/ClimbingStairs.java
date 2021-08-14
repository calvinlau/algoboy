/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * @author CalvinLiu
 * @Solution DP Function: f[n] = f[n-1] + f[n-2]
 * 
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
		if (n < 3) {
			return n;
		}
		int[] f = new int[n + 1];
		f[1] = 1;
		f[2] = 2;
		for (int i = 3; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
    }
}
