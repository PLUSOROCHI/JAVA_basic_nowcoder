package bat_Lesson.lesson7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree_7_09_Complete {
	 public boolean chk(TreeNode root) {
		
		 
		return printTree_Queue(root);
	        
	 }
	
	public boolean printTree_Queue(TreeNode root){
		if(root==null) {
			return true;
		}
		
		Queue<TreeNode>	queue=new LinkedList<TreeNode>();
		//判断是不是叶子结点
		boolean leaf=false;
		TreeNode left=null;
		TreeNode right=null;
		queue.offer(root);
		while(!queue.isEmpty())
		{
			TreeNode tmp=queue.poll();
			left=tmp.left;
			right=tmp.right;
			if(right!=null&&left==null) 
			{
				return false;
			}
			if(leaf&&(left!=null||right!=null))
			{
				return false;
			}
			
			if(left!=null) {
				queue.offer(left);
			}
			if(right!=null) {
				queue.offer(right);
			}
			else {
				leaf=true;
				if(left!=null) {
					queue.offer(left);
				}
				if(right!=null) {
					queue.offer(right);
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
