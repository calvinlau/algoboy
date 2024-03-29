/**
 * Given a binary tree

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
For example,
Given the following perfect binary tree,
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
 *
 */
public class PopulatingNextRightPointersinEachNodeII {
	public void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}

		TreeLinkNode parent = root;
		TreeLinkNode pre;
		TreeLinkNode next;
		while (parent != null) {
			pre = null;
			next = null;
			while (parent != null) {
				if (next == null) {
					next = (parent.left != null) ? parent.left : parent.right;
				}
				if (parent.left != null) {
					if (pre != null) {
						pre.next = parent.left;
						pre = pre.next;
					} else {
						pre = parent.left;
					}
				}
				if (parent.right != null) {
					if (pre != null) {
						pre.next = parent.right;
						pre = pre.next;
					} else {
						pre = parent.right;
					}
				}
				parent = parent.next;
			}
			parent = next;
		}
	}
}
