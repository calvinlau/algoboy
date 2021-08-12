/**
 * Given a string s, partition s such that every substring of the partition is a
 * palindrome.
 * 
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * 
 * For example, given s = "aab", Return 1 since the palindrome partitioning
 * ["aa","b"] could be produced using 1 cut.
 * 
 * @author calvinliu
 * @Solution DFS
 * 
 */
public class PalindromePartitioningII {

	public int minCut(String s) {
		return minCutRe(0, s);
	}

	private int minCutRe(int i, String s) {
		if (isPalindrome(s)) return i;
		int min = Integer.MAX_VALUE;
		for (int j = 1; j < s.length(); j++) {
			min = Math.min(min, minCutRe(i, s.substring(0, j)) + minCutRe(i, s.substring(j, s.length())) + 1);
		}
		return min;
	}

	private boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
		}
		return true;
	}
	
    public int minCut_1(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[n] = -1;
        boolean[][] isP = new boolean[n][n];
        for (int i = n - 1; i >= 0; --i) {
            dp[i] = n - 1 - i;
            for (int j = i; j < n; ++j) {
                if (s.charAt(i) == s.charAt(j) && (j < i + 2 || isP[i+1][j-1])) isP[i][j] = true;
                if (isP[i][j] == true) {
                    dp[i] = Math.min(dp[i], 1 + dp[j+1]);
                }
            }
        }
        return dp[0];
    }
}
