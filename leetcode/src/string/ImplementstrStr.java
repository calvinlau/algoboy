package string;

/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * @author kevinliu
 * @solution

 */
public class ImplementstrStr {

	//O(M*N)Time O(1)Space
	public int strStr(String haystack, String needle) {
		for (int i = 0; ; i++) {
			for (int j = 0; ; j++) {
				if (j == needle.length()) return i;
				if (i + j == haystack.length()) return -1;
				if (needle.charAt(j) != haystack.charAt(i + j)) break;
			}
		}
	}
}
