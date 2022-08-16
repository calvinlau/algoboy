package tree;

import java.util.List;

/**
 * Given a n-ary tree, find its maximum depth.
 *
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: 3
 *
 * @author kevinliu
 * @Solution Divide and conquer, get height firstly then compare left and right diff
 */
public class MaximumDepthofNaryTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int ret = 1, max = 0;
        for (Node node : root.children) {
            max = Math.max(max, maxDepth(node));
        }
        return ret + max;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
