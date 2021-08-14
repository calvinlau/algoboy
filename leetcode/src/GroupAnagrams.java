import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings, group anagrams together.
 * 
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], Return:
 * 
 * [ ["ate", "eat","tea"], ["nat","tan"], ["bat"] ]
 * 
 * @author calvinliu
 * @Solution Hash - Convert char to int
 * 
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs){
            char[] carr = str.toCharArray();
            Arrays.sort(carr);
            String key = new String(carr);
            List<String> list = map.get(key);
            if(list == null){
                list = new ArrayList<String>();
            }
            list.add(str);
            map.put(key, list);
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for(String key : map.keySet()){
            List<String> curr = map.get(key);
            Collections.sort(curr);
            res.add(curr);
        }
        return res;
    }
}
