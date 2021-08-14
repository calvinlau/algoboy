/**
 * Given an input string, reverse the string word by word.
 * 
 * For example, Given s = "the sky is blue", return "blue is sky the".
 * 
 * click to show clarification.
 * 
 * Clarification: What constitutes a word? A sequence of non-space characters
 * constitutes a word. Could the input string contain leading or trailing
 * spaces? Yes. However, your reversed string should not contain leading or
 * trailing spaces. How about multiple spaces between two words? Reduce them to
 * a single space in the reversed string.
 * 
 * @author calvinliu
 * @solution 1. using stringbuffer, not string(because it's immutable).
 *           2. reverse twice O(n)
 */
public class ReverseWordsinaString {
	public static void main(String[] args) {
		System.out.println(new ReverseWordsinaString().reverseWords_2("the sky is blue"));
	}

	public String reverseWords_1(String s) {
		if (s == null || s.trim().length() == 0) return "";
		String[] strs = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strs.length; i++) {
			if (!"".equals(strs[strs.length - i - 1])) {
				sb.append(strs[strs.length - i - 1] + " ");
			}
		}
		return sb.toString().substring(0, sb.length() - 1);
	}
	
	public String reverseWords_2(String s) {
		if (s == null || s.trim().length() == 0) return "";
		char[] chars = s.toCharArray();
		reverse(chars, 0, chars.length - 1);
		int start = 0;
		for (int i = 0; i <= chars.length; i++) {
			if (i == chars.length || chars[i] == ' ') {
				reverse(chars, start, i - 1);
				start = i + 1;
			}
		}
		return new String(chars);
	}

	private void reverse(char[] chars, int start, int end) {
		for (int i = start; i <= (start + end) / 2; i++) {
			char tmp = chars[i];
			chars[i] = chars[end + start - i];
			chars[end + start - i] = tmp;
		}
	}
}
