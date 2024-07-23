import java.util.ArrayList;

public class Find_pairs_with_given_sum_in_DLL {
    public static Node findtail(Node head){
        Node tail=head;
        while(tail.next !=null){
            tail=tail.next;
            
            
        }
        return tail;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int sum, Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(head==null) return ans;
        Node left=head;
        Node right=findtail(head);
        while(left.data<right.data){
            ArrayList<Integer> ds=new ArrayList<>();
            if(left.data+right.data==sum){
                ds.add(left.data);
                ds.add(right.data);
                ans.add(ds);
                left=left.next;
                right=right.prev;
                
            }
            else if(left.data+right.data<sum){
                left=left.next;
            }
            else{
                right=right.prev;
            }
            
        }
        return ans;
    }
}
