package symmetric_tree.v1;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		return this.isMirror(root, root);
	}

	private boolean isMirror(TreeNode t0, TreeNode t1) {
		if (t0 == null || t1 == null) {
			return t0 == t1;
		}
		return t0.val == t1.val && this.isMirror(t0.left, t1.right) && this.isMirror(t0.right, t1.left);
	}
}
