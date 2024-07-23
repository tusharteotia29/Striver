public class Reverse_Nodes_in_k_Group {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode newhead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    public ListNode getKthNode(ListNode temp,int k){
        k-=1;
        while(temp != null && k>0){
            k-=1;
            temp=temp.next;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevnode=null;
        while(temp != null){
            ListNode KthNode=getKthNode(temp,k);
            if(KthNode==null){
                if(prevnode !=null) prevnode.next=temp;
                break;
            }
            ListNode nextnode=KthNode.next;
            KthNode.next=null;
            reverseList(temp);
            if(temp==head){
                head=KthNode;
            }else{
                prevnode.next=KthNode;
            }
            prevnode=temp;
            temp=nextnode;
        }

    return head;
        
    }
}
