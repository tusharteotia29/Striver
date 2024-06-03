package A2Z_sheet;

import java.util.ArrayList;
import java.util.List;

public class binary_tree_postorder_traversal {

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
 


    public void postorder(TreeNode root,List<Integer> ans){
        if(root==null) return;

        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        postorder(root,ans);
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}

    

