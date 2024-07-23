class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Reverse_of_LL {
    // iterative
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev=null;
    //     ListNode temp=head;
    //     while(temp !=null){
    //         ListNode front=temp.next;
    //         temp.next=prev;
    //         prev=temp;
    //         temp=front;
    //     }
    //     return prev;

        
    // }


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
}
