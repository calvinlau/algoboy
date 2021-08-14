import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid. The brackets must close in the
 * correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * @author CalvinLiu
 * @solution Stack
 * 
 */
public class ValidParentheses {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == '(' || cur == '{' || cur == '[') {
				stack.push(cur);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if (cur == ')' && stack.pop() != '(') {
					return false;
				} else if (cur == '}' && stack.pop() != '{') {
					return false;
				} else if (cur == ']' && stack.pop() != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
