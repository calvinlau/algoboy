/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 *   "A man, a plan, a canal: Panama" is a palindrome.
 *   "race a car" is not a palindrome.
 *
 * @author calvinliu
 * @Solution Compare from start to end
 * 
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s == null || s.trim().length() == 0) {
			return true;
		}
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
