class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}
public class Delete_all_occurrences_of_given_key_in_DLL {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
        while(temp != null){
            if(temp.data==x){
                if(temp==head){
                    head=head.next;
                }
                Node nextnode=temp.next;
                Node prevnode=temp.prev;
                if(nextnode != null) nextnode.prev=prevnode;
                if(prevnode !=null) prevnode.next=nextnode;
                temp=temp.next;
            }
            else{
                temp=temp.next;
            }
            
        }
        return head;
    }
}
