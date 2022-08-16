package string;

/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 * 
 * Input: columnTitle = "A"
 * Output: 1
 *
 * Input: columnTitle = "AB"
 * Output: 28
 *
 * @author kevinliu
 * @solution

 */
public class ExcelSheetColumnNumber {

	public int titleToNumber(String s) {
		int ret = 0;
		for (char c : s.toCharArray()) {
			ret = ret * 26 + (c - 'A' + 1);
		}
		return ret;
	}
}
