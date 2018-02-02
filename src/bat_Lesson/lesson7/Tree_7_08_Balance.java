package bat_Lesson.lesson7;

public class Tree_7_08_Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean check(TreeNode root) {
        boolean[] res = new boolean[1];
        res[0] = true;
        int level = 0;
        getHeight(root, level, res);// 获得以根结点为头的深度
        return res[0];
    }
 
    public int getHeight(TreeNode head, int level, boolean[] res) {
        if (head == null) return level; // 如果当前 head 为空，则返回当前所到达的深度
        int LH = getHeight(head.left, level+1, res); // 获得以当前 head 为头的左子树深度
        if (!res[0]) return level; // 如果以当前 head 为头的左子树不是 AVL，直接返回当前所到达的深度
        int RH = getHeight(head.right, level+1, res); // 获得以当前 head 为头的右子树深度
        if (!res[0]) return level; // 如果以当前 head 为头的右子树不是 AVL，直接返回当前所达到的深度
        if (Math.abs(LH - RH) > 1) res[0] = false; // 比较以当前 head 为头的左子树深度和右子树深度，如果其相差大于 1，则说明以当前 head 为头的二叉树不是 AVL
        return Math.max(LH, RH); // 最后返回当前以 head 为头的深度
    }
}

