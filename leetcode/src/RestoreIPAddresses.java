import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible
 * valid IP address combinations.
 * 
 * For example: Given "25525511135",
 * 
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * 
 * @author calvinliu
 * 
 */
public class RestoreIPAddresses {
	
	public static void main(String[] args) {
		System.out.println(new RestoreIPAddresses().restoreIpAddresses("25525511135"));
	}
    public List<String> restoreIpAddresses(String s) {
    	List<String> ret = new ArrayList<String>();
    	restoreIpAddressesRe(ret, "", s, 0, 0);
    	return ret;
    }

	private void restoreIpAddressesRe(List<String> ret, String path, String s, int start, int step) {
        if (step == 4 && start == s.length()) {
            ret.add(path);
        }
        if (step == 4) return;
        if(s.length() - start > (4 - step) * 3) return ;
        if(s.length() - start < 4 - step) return ;
        if (path.length() != 0) path += ".";
        int num = 0;
        for (int i = start; i < start + 3 && i < s.length(); ++i) {
			num = num * 10 + s.charAt(i) - '0';
            if (num > 255) break;
            path += s.charAt(i);
			restoreIpAddressesRe(ret, path, s, i + 1, step + 1);
            if (num == 0) break;
        }
	}
}
