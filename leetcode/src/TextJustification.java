import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of words and a length L, format the text such that each line
 * has exactly L characters and is fully (left and right) justified.
 * 
 * You should pack your words in a greedy approach; that is, pack as many words
 * as you can in each line. Pad extra spaces ' ' when necessary so that each
 * line has exactly L characters.
 * 
 * Extra spaces between words should be distributed as evenly as possible. If
 * the number of spaces on a line do not divide evenly between words, the empty
 * slots on the left will be assigned more spaces than the slots on the right.
 * 
 * For the last line of text, it should be left justified and no extra space is
 * inserted between words.
 * 
 * For example, words: ["This", "is", "an", "example", "of", "text",
 * "justification."] L: 16.
 * 
 * Return the formatted lines as: 
 * [ "This    is    an", 
 *   "example  of text",
 *   "justification.  " ]
 */
public class TextJustification {

	public static void main(String[] args) {
		String[] strs = { "What","must","be","shall","be." };
		System.out.println(new TextJustification().fullJustify(strs, 12));
	}

	public List<String> fullJustify(String[] words, int L) {
		List<String> ret = new ArrayList<String>();
		String path = words[0];
		for (int i = 1; i < words.length; i++) {
			if ((path + " " + words[i]).length() > L) {
				path = fillspace(path, L);
				ret.add(path);
				path = words[i];
			} else {
				path = path + " " + words[i];
			}
		}
		if (path != null) {
			ret.add(fillspaceLast(path, L));
		}
		return ret;
	}

	private String fillspaceLast(String path, int L) {
		for (int i = path.length(); i < L; i++) {
			path += " ";
		}
		return path;
	}

	private String fillspace(String path, int L) {
		String[] strs = path.split(" ");
		if (strs.length == 1) {
			for (int i = path.length(); i < L; i++) {
				path += " ";
			}
			return path;
		}
		int count = L - path.replace(" ", "").length();
		int cur = 0;
		while (cur < count) {
			for (int i = 0; i < strs.length - 1; i++) {
				strs[i] = strs[i] + " ";
				cur++;
				if (cur == count) {
					path = "";
					for (int j = 0; j < strs.length; j++) {
						path += strs[j];
					}
					return path;
				}
			}
		}
		return path;
	}
}
