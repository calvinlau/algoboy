/**
 * Given a string S, find the longest palindromic substring in S. You may assume
 * that the maximum length of S is 1000, and there exists one unique longest
 * palindromic substring.
 * 
 * @author calvinliu
 * 
 */
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("aabbaac"));
	}

	public static String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		String ret = "";
		for (int i = 0; i < s.length(); i++) {
			String tmp = "";
			tmp = getPalindrome(s, i, i);
			if (tmp.length() > ret.length()) {
				ret = tmp;
			}
			tmp = getPalindrome(s, i, i + 1);
			if (tmp.length() > ret.length()) {
				ret = tmp;
			}
		}
		return ret;
	}

	public static String getPalindrome(String s, int start, int end) {
		while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return s.substring(start + 1, end);
	}
}
