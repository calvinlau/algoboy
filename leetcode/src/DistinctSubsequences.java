import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a string S and a string T, count the number of distinct subsequences of
 * T in S.
 * 
 * A subsequence of a string is a new string which is formed from the original
 * string by deleting some (can be none) of the characters without disturbing
 * the relative positions of the remaining characters. (ie, "ACE" is a
 * subsequence of "ABCDE" while "AEC" is not).
 * 
 * Here is an example: S = "rabbbit", T = "rabbit"
 * 
 * Return 3.
 * 
 * @author calvinliu
 * 
 */
public class DistinctSubsequences {

    public int numDistinct(String S, String T) {
    	Set<List<Integer>> ret = new HashSet<List<Integer>>();
    	List<Integer> level = new ArrayList<Integer>();
    	numDistinctRe(S, T, S, ret, level);
		return ret.size();
    }

	private void numDistinctRe(String S, String T, String path, Set<List<Integer>> ret, List<Integer> level) {
		if (path.length() == T.length()) {
			if (path.equals(T)) {
				Collections.sort(level);
				if (!ret.contains(level)) {
					ret.add(new ArrayList<Integer>(level));
				}
			}
			return;
		}
		for (int i = S.length() - path.length(); i < path.length(); i++) {
			level.add(i);
			numDistinctRe(S, T, path.substring(0, i) + path.substring(i + 1, path.length()), ret, level);
			level.remove(level.size() - 1);
		}
	}
	
    public int numDistinct_1(String s, String t) {
		int m = s.length();
		int n = t.length();
		int[] dp = new int[n + 1];
		Arrays.fill(dp, 0);
		dp[0] = 1;
		for (int i = 1; i <= m; ++i) {
			for (int j = n; j >= 1; --j) {
				dp[j] = dp[j] + (s.charAt(i - 1) == t.charAt(j - 1) ? dp[j - 1] : 0);
			}
		}
		return dp[n];
    }
}
