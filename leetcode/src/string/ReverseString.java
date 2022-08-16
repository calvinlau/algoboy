package string;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * @author kevinliu
 * @solution two pointer
 */
public class ReverseString {

	public void reverseString(char[] s) {
		for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
			char tmp = s[i];
			s[i] = s[j];
			s[j] = tmp;
		}
	}
}
