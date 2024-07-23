public class Add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummyNode=new ListNode(-1);
        ListNode curr=dummyNode;
        int carry=0;
        while(temp1 != null || temp2 != null){
            int sum=carry;
            if(temp1 != null) sum=sum+temp1.val;
            if(temp2 != null) sum+=temp2.val;

            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newnode;
            curr=curr.next;
            if(temp1 != null) temp1=temp1.next;
            if(temp2 != null) temp2=temp2.next;
        }
        if(carry != 0){
            ListNode newnode=new ListNode(carry);
            curr.next=newnode;

        }
        return dummyNode.next;
        
    }
}
