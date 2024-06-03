package A2Z_sheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


import javafx.util.Pair;

public class pre_in_post_in_1_traversal {

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


    public List<List<Integer>> getTreeTraversal(TreeNode root) {

        
        List<Integer> pre=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        List<Integer> in=new ArrayList<>();

        if (root==null) {
            return new ArrayList<>();
            
        }
        Stack<Pair<TreeNode,Integer>> st=new Stack<>();
        st.push(new Pair <>(root,1));

        while (!st.isEmpty()) {

            Pair<TreeNode,Integer> it=st.pop();

            // this is part of pre
            // increment 1 to 2
            // push the left side of the tree
            if (it.getValue()==1) {
                // Store the node's data
                // in the preorder traversal
                pre.add(it.getKey().val);
                // move to state 2
                // inorder for this node
                it=new Pair<>(it.getKey(),2);
                // push the updated state
                // back onto the stack
                st.push(it);


                if (it.getKey().left !=null) {
                    st.push(new Pair<>(it.getKey().left,1));

                    
                }
                
            }

            else if (it.getValue()==2) {

                in.add(it.getKey().val);


                it=new Pair<>(it.getKey(),3);
                

                st.push(it);


                if (it.getKey().right !=null) {
                    st.push(new Pair<>(it.getKey().right,1));
                    
                }

                else{
                    post.add(it.getKey().val);
                }
            }

            
        }
        List<List<Integer>> result=new ArrayList<>();
            result.add(pre);
            result.add(in);
            result.add(post);
            return result;
            


    }

    public static void main(String[] args) {
        
    }
    
}
