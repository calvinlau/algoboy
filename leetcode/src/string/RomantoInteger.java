package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * @author kevinliu
 * @Solution
 * 
 */
public class RomantoInteger {

	public int romanToInt(String s) {
		int sum = 0;
		if (s.contains("IV")) sum -= 2;
		if (s.contains("IX")) sum -= 2;
		if (s.contains("XL")) sum -= 20;
		if (s.contains("XC")) sum -= 20;
		if (s.contains("CD")) sum -= 200;
		if (s.contains("CM")) sum -= 200;

		char[] c = s.toCharArray();
		int count = 0;

		for (; count <= s.length() - 1; count++) {
			if (c[count] == 'M') sum += 1000;
			if (c[count] == 'D') sum += 500;
			if (c[count] == 'C') sum += 100;
			if (c[count] == 'L') sum += 50;
			if (c[count] == 'X') sum += 10;
			if (c[count] == 'V') sum += 5;
			if (c[count] == 'I') sum += 1;
		}
		return sum;
	}

	public int romanToInt_2(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);

		int length = s.length();
		int result = m.get(s.charAt(length - 1));
		for (int i = length - 2; i >= 0; i--) {
			if (m.get(s.charAt(i + 1)) <= m.get(s.charAt(i))) {
				result += m.get(s.charAt(i));
			} else {
				result -= m.get(s.charAt(i));
			}
		}
		return result;
	}
}
