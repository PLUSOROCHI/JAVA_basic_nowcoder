package bat_Lesson.lesson7;

import java.util.ArrayList;
import java.util.LinkedList;



public class Tree_7_05_LevelTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[][] printTree(TreeNode root) {
		 if (root == null) {
	            return null;
	        }
	        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	        levelTraverse(root, 1, res);
	        int[][] ans = new int[res.size()][];
	        for (int i = 0; i < res.size(); i++) {
	            ans[i] = new int[res.get(i).size()];
	            for (int j = 0; j < res.get(i).size(); j++) {
	                ans[i][j] = res.get(i).get(j);
	            }
	        }
	        return ans;
	 }
	public void levelTraverse(TreeNode root, int level, ArrayList<ArrayList<Integer>> res) {
        //情况1无根
		if (root == null) {
            return;
        }
		//判断大小
        if (res.size() < level) {
            res.add(new ArrayList<Integer>());
        }
        //加入当前的根节点
        res.get(level - 1).add(root.val);
        //遍历左子树和右子树
        levelTraverse(root.left, level + 1, res);
        levelTraverse(root.right, level + 1, res);
    }
	
	
	/**
	 * 使用了queue来进行层次遍历
	 * @param root
	 * @return
	 */
	public int[][] printTree_Queue(TreeNode root){
		
        ArrayList<ArrayList<TreeNode>> result = new ArrayList<>();
        ArrayList<TreeNode> level = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
         
        TreeNode tmp = root;//根结点
        TreeNode last = root;//当前行最右结点
        TreeNode nlast = null;//下一行最右结点
         
        queue.add(root);
         
        while(queue.size()!=0){
            
        	//取头结点
            tmp = queue.poll();
            level.add(tmp);
             
            if(tmp.left!=null){
                queue.add(tmp.left);
                nlast = tmp.left;
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
                nlast = tmp.right;
            }
            //改变当前层次遍历的根，将该层遍历结果写入
            if(tmp == last){
                last = nlast;
                result.add(level);
                level = new ArrayList();
                 
            }
        }
        int[][]result2 = new int[result.size()][];
        for(int i=0;i<result.size();i++){
            result2[i] = new int[result.get(i).size()];
            for(int j=0;j<result2[i].length;j++){
                result2[i][j] = result.get(i).get(j).val;
            }
        }
        return result2;  
	}

}
