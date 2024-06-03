package A2Z_sheet;

public class depth_of_the_tree {


     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 

    public int maxDepth(TreeNode root) {

        if(root==null) return 0;

        int lh=maxDepth(root.left);
        int lr=maxDepth(root.right);

        return 1+ Math.max(lh,lr);
        
    }


    public static void main(String[] args) {
        
    }
    
}
