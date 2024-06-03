package A2Z_sheet;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterative_postorder_2_stack {

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
   


    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st1=new Stack<TreeNode>();
        Stack<TreeNode> st2=new Stack<TreeNode>();
        List<Integer> postOrder=new ArrayList<Integer>();

        if (root==null) {
            return postOrder;
            
        }

        st1.push(root);
        while (!st1.isEmpty()) {
            root=st1.pop();
            st2.add(root);
            if (root.left  !=null) st1.push(root.left);

            if (root.right !=null) st2.push(root.right);

            
        }
        while (!st2.isEmpty()) {
            postOrder.add(st2.pop().val);
            
        }
        return postOrder;
    }

    public static void main(String[] args) {
        
    }
    
}
