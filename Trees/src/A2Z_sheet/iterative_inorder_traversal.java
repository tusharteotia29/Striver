package A2Z_sheet;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterative_inorder_traversal {

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

    
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> inorder=new ArrayList<Integer>();
        Stack<TreeNode> st=new Stack<TreeNode>();
        TreeNode node=root;
        while (true) {
            if (node!=null) {
                st.push(node);
                node=node.left;
                
            }
            else{
                if (st.isEmpty()) {
                    break;
                    
                }
                node=st.pop();
                inorder.add(node.val);
                node=node.right;
            }
            
        }
        return inorder;
    }
    
}
