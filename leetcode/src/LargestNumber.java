import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 *
 */
public class LargestNumber {
	
	public String largestNumber(int[] nums) {
		if (nums == null || nums.length == 0)
			return "";
		String[] Snum = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
			Snum[i] = nums[i] + "";

		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				String s1 = str1 + str2;
				String s2 = str2 + str1;
				return s1.compareTo(s2);
			}
		};

		Arrays.sort(Snum, comp);
		if (Snum[Snum.length - 1].charAt(0) == '0')
			return "0";

		StringBuilder sb = new StringBuilder();

		for (String s : Snum)
			sb.insert(0, s);

		return sb.toString();
	}
}
