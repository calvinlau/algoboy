package string;

/**
 * Given an input string, reverse the string word by word.
 * 
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 *
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 *
 * @author kevinliu
 * @solution 1. using stringbuffer, not string(because it's immutable).
 *           2. reverse twice O(n)
 */
public class ReverseWordsinaString {
	public String reverseWords_1(String s) {
		String[] arr = s.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].length() == 0) {
				continue;
			}
			sb.append(arr[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	//O(N)time
	//O(N)space
	public String reverseWords_2(String s) {
		if (s == null) return null;

		char[] a = s.toCharArray();
		int n = a.length;

		// step 1. reverse the whole string
		reverse(a, 0, n - 1);
		// step 2. reverse each word
		reverseWords(a, n);
		// step 3. clean up spaces
		return cleanSpaces(a, n);
	}

	void reverseWords(char[] a, int n) {
		int i = 0, j = 0;
		while (i < n) {
			while (i < j || i < n && a[i] == ' ') i++; // skip spaces
			while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
			reverse(a, i, j - 1);                   // reverse the word
		}
	}

	// trim leading, trailing and multiple spaces
	String cleanSpaces(char[] a, int n) {
		int i = 0, j = 0;
		while (j < n) {
			while (j < n && a[j] == ' ') j++;             // skip spaces
			while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
			while (j < n && a[j] == ' ') j++;             // skip spaces
			if (j < n) a[i++] = ' ';                      // keep only one space
		}

		return new String(a).substring(0, i);
	}

	// reverse a[] from a[i] to a[j]
	private void reverse(char[] a, int i, int j) {
		while (i < j) {
			char t = a[i];
			a[i++] = a[j];
			a[j--] = t;
		}
	}
}
