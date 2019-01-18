package offer;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
  }
public class TreeDepth_38 {
	
	public int TreeDepth(TreeNode root) {
        
		if(root == null)
			return 0;

		return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }

	
}
