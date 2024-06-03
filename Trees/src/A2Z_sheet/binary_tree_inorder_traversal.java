package A2Z_sheet;
import java.util.ArrayList;
import java.util.List;

public class binary_tree_inorder_traversal {

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
 

    public void inorder(List<Integer> ans, TreeNode node){
        if(node==null) return;

        inorder(ans,node.left);
        ans.add(node.val);
        inorder(ans,node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {


        List<Integer> ans=new ArrayList<>();
        inorder(ans,root);
        return ans;
        
    }

    public static void main(String[] args) {
        
    }
}
    

