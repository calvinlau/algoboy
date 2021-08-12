import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, partition s such that every substring of the partition is a
 * palindrome.
 * 
 * Return all possible palindrome partitioning of s.
 * 
 * For example, given s = "aab", Return
 * 
 * [ ["aa","b"], ["a","a","b"] ]
 * 
 * @author calvinliu
 * @Solution DFS
 * 
 */
public class PalindromePartitioning {
	
	public List<List<String>> partition(String s) {
		List<List<String>> ret = new ArrayList<List<String>>();
		List<String> path = new ArrayList<String>();
		dfs(ret, path, 0, s);
		return ret;
	}

	private void dfs(List<List<String>> ret, List<String> path, int start, String s) {
		if (start == s.length()) {
			ret.add(new ArrayList<String>(path));
			return;
		}
		for (int i = start + 1; i <= s.length(); i++) {
			if (isPalindrome(s.substring(start, i))) {
				path.add(s.substring(start, i));
				dfs(ret, path, i, s);
				path.remove(path.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
		}
		return true;
	}
}
