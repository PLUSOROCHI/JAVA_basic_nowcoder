package bat_Lesson.lesson7;

import java.util.ArrayList;
import java.util.Stack;

public class Tree_7_03_noRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] convert(TreeNode root) {
		 ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	        list.add(preOrder(root));
	        list.add(inOrder(root));
	        list.add(postOrder(root));
	        int[][] res = new int[3][list.get(0).size()];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < list.get(0).size(); j++) {
	                res[i][j] = list.get(i).get(j);
	            }
	        }
	        return res;
    }

	

	private ArrayList<Integer> inOrder(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur=root;
        
        while(!stack.isEmpty() || cur != null){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        
        
        
		return null;
	}

	private ArrayList<Integer> preOrder(TreeNode root) {
		
		ArrayList<Integer> res =new ArrayList<>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if (root == null) {
	            return res;
	    }
		stack.push(root);
		TreeNode cur=root;
		while(!stack.isEmpty()) {
			cur=stack.pop();
			res.add(cur.val);
			if(cur.left!=null) {
				stack.push(cur.left);
			}
			if(cur.right!=null) {
				stack.push(cur.right);
			}
		}
		return res;
	}
	
	private ArrayList<Integer> postOrder(TreeNode root) {
		
		ArrayList<Integer> res =new ArrayList<>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if (root == null) {
	            return res;
	    }
		stack.push(root);
		TreeNode cur=root;
		while(!stack.isEmpty()) {
			cur=stack.pop();
			res.add(cur.val);
			if(cur.left!=null) {
				stack.push(cur.left);
			}
			if(cur.right!=null) {
				stack.push(cur.right);
			}
		}
		return res;
	}
}
