import java.util.Stack;

/**
 * Given a string which contains only lowercase letters, remove duplicate
 * letters so that every letter appear once and only once. You must make sure
 * your result is the smallest in lexicographical order among all possible
 * results.
 * 
 * Example: 
 * Given "bcabc" Return "abc"
 * Given "cbacdcbc" Return "acdb"
 * 
 * @author calvinliu
 * @Solution Stack
 * 
 */
public class RemoveDuplicateLetters {
	public String removeDuplicateLetters(String s) {
		int[] res = new int[26];
		boolean[] visited = new boolean[26];
		char[] chars = s.toCharArray();
		for (char c : chars) {
			res[c - 'a']++;
		}
		Stack<Character> stack = new Stack<>();
		int index;
		for (char c : chars) {
			index = c - 'a';
			res[index]--;
			if (visited[index])
				continue;
			while (!stack.isEmpty() && c < stack.peek() && res[stack.peek() - 'a'] != 0) {
				visited[stack.pop() - 'a'] = false;
			}
			stack.push(c);
			visited[index] = true;
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.insert(0, stack.pop());
		}
		return sb.toString();
	}
}
