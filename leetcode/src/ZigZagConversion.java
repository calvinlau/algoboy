import java.util.ArrayList;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 * And then read line by line: "PAHNAPLSIIGYIR" Write the code that will take a
 * string and make this conversion given a number of rows:
 * 
 * string convert(string text, int nRows); convert("PAYPALISHIRING", 3) should
 * return "PAHNAPLSIIGYIR".
 * 
 * @author calvinliu
 * 
 */
public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if (numRows <= 1 || s.length() < 2)
			return s;
		ArrayList<StringBuilder> sbs = new ArrayList<StringBuilder>();
		for (int k = 0; k < numRows; k++) {
			sbs.add(new StringBuilder());
		}
		int nCount = 2 * (numRows - 1);
		for (int i = 0; i < s.length(); i++) {
			sbs.get(numRows - 1 - Math.abs(numRows - 1 - (i % nCount))).append(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < numRows; j++) {
			sb.append(sbs.get(j));
		}
		return sb.toString();
	}
}
