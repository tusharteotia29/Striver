package A2Z_sheet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;



public class binary_tree_preorder_traversal {

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

     public void preordertr(TreeNode node,List<Integer> arr){
        if(node==null) return;

        arr.add(node.val);
        preordertr(node.left,arr);
        preordertr(node.right,arr);
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> arr=new ArrayList<>();

        preordertr(root,arr);
        return arr;
        
        
    }

    public static void main(String[] args) {
        
    }
    
}
