import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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
 * @solution BFS
 * 
 */
public class RemoveInvalidParentheses {

	private List<String> res = new ArrayList<String>();
	private int max = 0;

	public List<String> removeInvalidParentheses(String s) {
		dfs(s, "", 0, 0);
		if (res.size() == 0) {
			res.add("");
		}
		return res;
	}

	private void dfs(String str, String subRes, int countLeft, int maxLeft) {
		if (str.length() == 0) {
			if (countLeft == 0 && subRes.length() != 0) {
				if (maxLeft > max) {
					max = maxLeft;
				}
				if (max == maxLeft && !res.contains(subRes)) {
					res.add(subRes.toString());
				}
			}
			return;
		}

		if (str.charAt(0) == '(') {
			dfs(str.substring(1), subRes.concat("("), countLeft + 1, maxLeft + 1);
			dfs(str.substring(1), subRes, countLeft, maxLeft);
		} else if (str.charAt(0) == ')') {
			if (countLeft > 0) {
				dfs(str.substring(1), subRes.concat(")"), countLeft - 1, maxLeft);
			}
			dfs(str.substring(1), subRes, countLeft, maxLeft);
		} else {
			dfs(str.substring(1), subRes.concat(String.valueOf(str.charAt(0))), countLeft, maxLeft);
		}
	}
	
	
	public List<String> removeInvalidParentheses_2(String s) {
		List<String> res = new ArrayList<>();
		if (s == null)
			return res;
		Set<String> visited = new HashSet<>();
		Queue<String> queue = new LinkedList<>();
		queue.add(s);
		visited.add(s);
		boolean found = false;

		while (!queue.isEmpty()) {
			s = queue.poll();
			if (isValid(s)) {
				res.add(s);
				found = true;
			}
			if (found)
				continue;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != '(' && s.charAt(i) != ')')
					continue;
				String t = s.substring(0, i) + s.substring(i + 1);
				if (!visited.contains(t)) {
					queue.add(t);
					visited.add(t);
				}
			}
		}
		return res;
	}

	boolean isValid(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				count++;
			if (c == ')' && count-- == 0)
				return false;
		}
		return count == 0;
	}
}
