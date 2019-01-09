package offer;

import java.util.ArrayList;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class FindPath_24 {

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        solution(res, new ArrayList<>(),root,0,target);
        
        return res;
    }
	
	public void solution(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tres, TreeNode root,int csum, int target){
		if(root == null){
			if(csum == target){
				System.out.println(tres);
				res.add(tres);
			}
			return;
		}

		tres.add(root.val);
		ArrayList<Integer> t = new ArrayList<>(tres);
		solution(res, t,root.left,csum+root.val,target);
		solution(res, t,root.right,csum+root.val,target);
	}
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		t1.left = t2;
		t1.right =t3;
		t2.left = t4;
		t2.right = t5;
		t4.left = t7;
		t3.left = t6;
		t3.right = t7;
		
		FindPath_24 f = new FindPath_24();
		
		System.out.println(f.FindPath(t1, 7));
	}
}
