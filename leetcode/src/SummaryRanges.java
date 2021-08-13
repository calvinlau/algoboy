import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its
 * ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * 
 * @author CalvinLiu
 * @author 
 * 
 */
public class SummaryRanges {

	public List<String> summaryRanges(int[] nums) {
		List<String> summary = new ArrayList<String>();
		if (nums.length == 0)
			return summary;
		int start = 0;
		int end = 0;
		String range;
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 1) {
				end = i;
				if (end != start)
					range = nums[start] + "->" + nums[end];
				else
					range = "" + nums[start];
				summary.add(range);
			} else if (nums[i] != nums[i + 1] - 1) {
				end = i;
				if (end != start)
					range = nums[start] + "->" + nums[end];
				else
					range = "" + nums[start];
				start = i + 1;
				summary.add(range);
			}
		}
		return summary;
	}
}
