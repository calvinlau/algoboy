/**
 * One way to serialize a binary tree is to use pre-order traversal. When we
 * encounter a non-null node, we record the node's value. If it is a null node,
 * we record using a sentinel value such as #.
 * 
 * @author calvinliu
 * @Solution Divide and conquer, get height firstly then compare left and right
 *           diff
 * 
 */
public class VerifyPreorderSerializationofaBinaryTree {

	public boolean isValidSerialization(String preorder) {
		String[] nodes = preorder.split(",");
		int diff = 1;
		for (String node : nodes) {
			if (--diff < 0)
				return false;
			if (!node.equals("#"))
				diff += 2;
		}
		return diff == 0;
	}
}
