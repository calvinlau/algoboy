/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
 * @author calvinliu
 * @Solution Hash - Convert char to int 
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		int[] letters = new int[26];
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i) - 'a'] += 1;
			letters[t.charAt(i) - 'a'] -= 1;
		}
		for (int i = 0; i < 26; i++) {
			if (letters[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
