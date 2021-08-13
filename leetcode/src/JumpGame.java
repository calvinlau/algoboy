/**
 * Given an array of non-negative integers, you are initially positioned at the
 * first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that
 * position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * For example: A = [2,3,1,1,4], return true.
 * 
 * A = [3,2,1,0,4], return false.
 * 
 * @author calvinliu
 * @solution 1. Recursion
 *           3. Math.max(pos, i + A[i]) > A.length - 1
 */
public class JumpGame {
	public static void main(String[] args) {
		int[] A = { 2,3,1,1,4 };
		System.out.println(new JumpGame().canJump_3(A));
	}
	
    public boolean canJump_1(int[] A) {
        if (A == null || A.length == 0) return false;
    	return canJumpRe(A, 0);
    }

	private boolean canJumpRe(int[] a, int start) {
		if (start == a.length) {
			return true;
		}
		for (int i = 1; i + start < a.length && i <= a[start]; i++) {
			 if (canJumpRe(a, i)) {
				 return true;
			 }
		}
		return false;
	}
	
    public boolean canJump_2(int[] A) {
        if (A == null || A.length == 0) return false;
        boolean[] dp = new boolean[A.length];
        dp[A.length - 1] = true;
        for (int i = A.length - 2; i >= 0; i--) {
        	for (int j = i + 1; j <= i + A[i] && j < A.length; j++) {
        		if (dp[j]) {
            		dp[i] = true;
            		break;
        		}
			}
		}
    	return dp[0];
    }
    
    public boolean canJump_3(int[] A) {
    	if (A == null || A.length == 0) return false;
    	int pos = 0;
    	for (int i = 0; i < A.length; i++) {
    		if (pos >= i) {
    			pos = Math.max(pos, i + A[i]);
    		}
		}
    	return pos >= A.length - 1;
    }
}
