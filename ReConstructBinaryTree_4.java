package offer;

 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class ReConstructBinaryTree_4 {
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        
		if(pre.length == 0 || in.length == 0)
			return null;
		
		return solution(pre,in,0,0,in.length-1);
		
    }
	
	public TreeNode solution(int[] pre, int[] in,int pi,int ins, int ine){
		
		if(pi >= pre.length || ins > ine)
			return null;
		TreeNode node = new TreeNode(pre[pi]);
		
		for(int i = ins; i <= ine; i++){
			if(in[i] == node.val){
				node.left = solution(pre,in,pi+1,ins,i-1);
				node.right = solution(pre,in,pi+ i-ins+1,i+1, ine);
				break;
			}
		}
		
		return node;
	}
	
	public void pre(TreeNode t){
		if(t == null)
			return;
		System.out.println(t.val);
		pre(t.left);
		pre(t.right);
	}
	
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		
		ReConstructBinaryTree_4 r = new ReConstructBinaryTree_4();
		TreeNode t = r.reConstructBinaryTree(pre, in);
		r.pre(t);
	}

}
