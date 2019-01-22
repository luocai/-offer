package offer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Print_59 {
	
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		
		LinkedList<TreeNode> queue = new LinkedList<>();
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		queue.addLast(null);  // null 是分层符合
		queue.addLast(pRoot);
	
		
		boolean level = true; // 分层
		
		ArrayList<Integer> tr = new ArrayList<>();
		
		while(queue.size() != 1){
			TreeNode node = queue.removeFirst();
			
			if(node == null) { //到了分层处
				Iterator<TreeNode> iter = null;
				if(level){
					iter = queue.iterator(); // 顺序
				}else{
					iter = queue.descendingIterator(); //逆序
				}
				
				while(iter.hasNext()){
					TreeNode temp = iter.next();
					tr.add(temp.val);
				}
				res.add(tr);
				tr = new ArrayList<>();
				queue.addLast(null);
				level = !level; // 偶数层
				continue;
			}
			if(node.left != null){
				queue.addLast(node.left);
			}
			if(node.right != null){
				queue.addLast(node.right);
			}
			
		}
		
		
		return res;
    }

}
