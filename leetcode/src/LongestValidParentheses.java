import java.util.Stack;

/**
 * Given a string containing just the characters '(' and ')', find the length of
 * the longest valid (well-formed) parentheses substring.
 * 
 * For "(()", the longest valid parentheses substring is "()", which has length
 * = 2.
 * 
 * Another example is ")()())", where the longest valid parentheses substring is
 * "()()", which has length = 4.
 * 
 * @author calvinliu
 * @solution Stack and DP len for storing
 * 
 */
public class LongestValidParentheses {

	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int ret = 0;
		int[] dp = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				if (!stack.isEmpty()) {
					int j = stack.pop();
					dp[i] = (j > 0 ? dp[j - 1] : 0) + (i - j + 1);
					ret = Math.max(ret, dp[i]);
				}
			}
		}
		return ret;
	}
}
