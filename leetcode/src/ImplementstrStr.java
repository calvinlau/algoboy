/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * @author calvinliu
 * @solution 1. strait away O(N^2)
 *           2. KMP
 */
public class ImplementstrStr {

	public int strStr_1(String haystack, String needle) {
		int len1 = haystack.length(), len2 = needle.length();
		if (len2 == 0) return 0;
		if (haystack == null || len1 == 0) return -1;
		int i = 0, j = 0;
		while(i < len1) {
			for (j = 0; j < len2 && (i + j) < len1 && haystack.charAt(i + j) == needle.charAt(j); j++);
			if (j == len2) return i;
			i++;
		}
		return -1;
	}
	
	public int strStr_2(String haystack, String needle) {
        int sLen = haystack.length(), tLen = needle.length();
        if(tLen == 0) return 0;
        if (haystack==null || needle==null || sLen==0) return -1;
        int i = 0, j = 0;
        while (i < sLen) {
            for (j = 0; j < tLen && (i+j) < sLen && haystack.charAt(i+j) == needle.charAt(j); ++j);
            if (j == tLen) return i;
            ++i;
        }
		return -1;
	}
}
