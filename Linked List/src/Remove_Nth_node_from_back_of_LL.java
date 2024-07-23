public class Remove_Nth_node_from_back_of_LL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;

        }
        ListNode slow=head;
        if(fast==null) return head.next;
        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next=slow.next.next;
        return head;
        
    }
}
