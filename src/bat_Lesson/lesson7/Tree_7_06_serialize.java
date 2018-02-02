package bat_Lesson.lesson7;

public class Tree_7_06_serialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public String toString(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }
    public void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#!");
            return;
        }
        //先根遍历
        sb.append(root.val + "!");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }
}
