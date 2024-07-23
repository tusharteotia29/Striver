class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
public class length_of_loop {
    static int findlength(Node slow,Node fast){
        int cnt=1;
        fast=fast.next;
        while(slow != fast){
            cnt++;
            fast=fast.next;
        }
        return cnt;
    }
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return findlength(slow,fast);
        }
        return 0;
    }
}
