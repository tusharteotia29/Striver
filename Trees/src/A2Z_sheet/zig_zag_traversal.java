package A2Z_sheet;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class zig_zag_traversal {

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
 

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result=new ArrayList<>();

        if(root==null) return result;


        Queue<TreeNode> nodeQueue=new LinkedList<>();

        nodeQueue.add(root);

        boolean lefttoright=true;

        while (!nodeQueue.isEmpty()) {

            int size=nodeQueue.size();

            List<Integer> row =new ArrayList<>();

            

            for(int i=0; i<size;i++){

                TreeNode node=nodeQueue.poll();

                int index=lefttoright ? i : (size-1-i);
            
            row.add(index,node.val);

            if (node.left !=null) {
                nodeQueue.add(node.left);
                
            }
            if (node.right !=null) {
                nodeQueue.add(node.right);
                
            }
        }
        
        lefttoright=!lefttoright;

        result.add(row);
        
        }

        return result;

        

    }


    public static void main(String[] args) {
        
    }
    
}
