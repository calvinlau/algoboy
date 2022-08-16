package map;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * @author kevinliu
 * @Solution Hash - Convert char to int 
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		int[] count = new int[26];
		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			count[c - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
