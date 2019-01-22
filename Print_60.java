package offer;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Print_60 {
	
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	    
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		if(pRoot == null)
			return res;
		LinkedList<TreeNode> queue = new LinkedList<>();
		
		queue.add(pRoot);
		int size = 1;
		
		ArrayList<Integer> tres = new ArrayList<>();
		while(queue.isEmpty()){
			TreeNode node = queue.poll();
			size--;
			tres.add(node.val);
			
			if(node.left != null){
				queue.add(node.left);
			}
			if(node.right != null){
				queue.add(node.right);
			}
			
			if(size == 0){
				res.add(tres);
				tres = new ArrayList<>();
				size = queue.size();
			}
		}
		
		return res;
    }

}
