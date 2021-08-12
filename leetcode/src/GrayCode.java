import java.util.ArrayList;
import java.util.List;

/**
 * The gray code is a binary numeral system where two successive values differ
 * in only one bit.
 * 
 * Given a non-negative integer n representing the total number of bits in the
 * code, print the sequence of gray code. A gray code sequence must begin with
 * 0.
 * 
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * 
 * 00 - 0 
 * 01 - 1 
 * 11 - 3 
 * 10 - 2
 * Note: For a given n, a gray code sequence is not
 * uniquely defined.
 * 
 * For example, [0,2,3,1] is also a valid gray code sequence according to the
 * above definition.
 * 
 * For now, the judge is able to judge based on one instance of gray code
 * sequence. Sorry about that.
 * 
 * @author calvinliu
 * 
 */
public class GrayCode {
	
	public static void main(String[] args) {
		System.out.println(new GrayCode().grayCode_2(4));
	}

    public List<Integer> grayCode(int n) {
    	List<Integer> ret = new ArrayList<Integer>();
    	grayCodeRe(ret, n, 0, 0);
    	return ret;
    }

	private void grayCodeRe(List<Integer> ret, int n, int start, int code) {
		if (ret.size() == 0) {
			ret.add(0);
			ret.add(1);
		}
		if (start >= n) {
			ret.add(code + (1 << (start + 1)));
			return;
		}
		for (int i = 0; i < ret.size(); i++) {
			grayCodeRe(ret, n, start + 1, ret.get(i));
		}
	}
	
    public List<Integer> grayCode_2(int n) {
    	List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; ++i)
            res.add((int)((i >> 1) ^ i));
        return res;
    }
}
