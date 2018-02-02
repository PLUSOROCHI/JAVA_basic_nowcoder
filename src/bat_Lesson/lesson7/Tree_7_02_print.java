package bat_Lesson.lesson7;

import java.util.ArrayList;


public class Tree_7_02_print {

	public static void main(String[] args) {
		
	}
	

	public int[][] convert(TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<Integer>());
        }
        preOrder((root), list.get(0));
        inOrder((root), list.get(1));
        postOrder((root), list.get(2));
        int[][] arr = new int[3][list.get(0).size()];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < list.get(0).size(); j++) {
                arr[i][j] = list.get(i).get(j);
            }
        }
        return arr;
    }
    public void preOrder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }
    public void inOrder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }
    public void postOrder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.val);
    }
}