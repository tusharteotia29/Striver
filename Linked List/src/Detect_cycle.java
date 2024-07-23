public class Detect_cycle {
     // public boolean hasCycle(ListNode head) {
    //     ListNode temp=head;
    //     Set<ListNode> nodeset=new HashSet<>();

    //     while(temp != null){
    //         if(nodeset.contains(temp)){
    //             return true;
    //         }

    //         nodeset.add(temp);
    //         temp=temp.next;
    //     }
    //     return false;
        
    // }


    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
     }
}
