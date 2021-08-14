/**
 * There are two sorted arrays A and B of size m and n respectively. Find the
 * median of the two sorted arrays. The overall run time complexity should be
 * O(log (m+n)).
 * 
 * @author calvinliu
 * 
 */
public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		int[] a = { 1 };
		int[] b = { 3, 4 };
		System.out.println(new MedianofTwoSortedArrays().findMedianSortedArrays(a, b));
	}

	public double findMedianSortedArrays(int A[], int B[]) {
		int a = A.length, b = B.length, n = a + b;
		if (n % 2 == 0) {
			return (findkth(A, 0, B, 0, n / 2) + findkth(A, 0, B, 0, n / 2 + 1)) / 2.0;
		} else {
			return findkth(A, 0, B, 0, n / 2 + 1);
		}
	}

	private int findkth(int[] A, int a, int[] B, int b, int k) {
		if (A.length - a > B.length - b) {
			return findkth(B, b, A, a, k);
		}
		if (A.length <= a) {
			return B[b + k -1];
		}
		if (k == 1) {
			return Math.min(A[a], B[b]);
		}
		int midA = Math.min(k / 2, A.length - a);
		int midB = k - midA;
		if (A[a + midA - 1] < B[b + midB - 1]) {
			return findkth(A, a + midA, B, b, k - midA);
		} else if (A[a + midA - 1] > B[b + midB - 1]) {
			return findkth(A, a, B, b + midB, k - midB);
		} else {
			return A[a + midA - 1];
		}
	}
}
