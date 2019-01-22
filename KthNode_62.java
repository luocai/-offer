package offer;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class KthNode_62 {
	
	Map<Integer, TreeNode> map = new HashMap<>();
	int index = 1;
	TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(pRoot == null)
			return null;
        intravel(pRoot);
        return map.get(k);
    }
	
	public void intravel(TreeNode root){
		if(root == null)
			return;
		
		intravel(root.left);
		map.put(index++, root);
		intravel(root.right);
	}

}
