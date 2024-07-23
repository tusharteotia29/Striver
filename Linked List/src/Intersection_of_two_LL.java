public class Intersection_of_two_LL {
     // public ListNode collisionPoint(ListNode t1,ListNode t2,int d){
    //     while(d>0){
    //         d--;
    //         t2=t2.next;
    //     }
    //     while(t1 != t2){
    //         t1=t1.next;
    //         t2=t2.next;
    //     }
    //     return t1;
    // }
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode t1=headA;
    //     ListNode t2=headB;
    //     int n1=0;
    //     int n2=0;

    //     while(t1 != null){
    //         n1++;
    //         t1=t1.next;
    //     }

    //     while(t2 != null){
    //         n2++;
    //         t2=t2.next;
    //     }

    //     t1=headA;
    //     t2=headB;

    //     if(n1<n2){
    //         return collisionPoint(t1,t2,n2-n1);
    //     }
    //     else{
    //         return collisionPoint(t2,t1,n1-n2);
    //     }
        
    // }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1 != t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2) return t1;
            if(t1==null)  t1=headB;
            if(t2==null)  t2=headA;
        }
        return t1;

     }
}
