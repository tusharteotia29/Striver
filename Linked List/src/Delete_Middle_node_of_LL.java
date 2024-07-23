public class Delete_Middle_node_of_LL {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next == null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        fast=head.next.next;
        while(fast != null && fast.next != null ){
            slow=slow.next;
            fast=fast.next.next;

        }
        slow.next=slow.next.next;
        return head;
        
    }
}
