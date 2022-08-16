package string;

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 *
 * @author kevinliu
 * @Solution Compare from start to end
 */
public class ValidPalindromeII {

    // O(N)time
    // O(N)space
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r && arr[r] == arr[l]) {
            r--;
            l++;
        }
        return check(arr, l + 1, r) || check(arr, l, r - 1);
    }

    boolean check(char[] arr, int l, int r) {
        while (l < r) {
            if (arr[l++] != arr[r--]) {
                return false;
            }
        }
        return true;
    }
}
