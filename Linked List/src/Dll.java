
class Node{
    int data;
    Node next;
    Node prev;
    Node(int a){  data = a; next = null; prev=null;}
    Node(int a ,Node next,Node prev){
        data=a;
        this.next=next;
        this.prev=prev;
    }

}
public class Dll {

    public static Node convertArrtoDll(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;

    }

    public static Node deleteHead(Node head){
        if(head==null || head.next == null){
            return null;
        }
        Node prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;

        return head;
    }

    public static Node deleteTail(Node head){
       
        if(head==null || head.next == null){
            return null;
        }
        Node tail=head;
        while (tail !=null) {
            tail=tail.next;
            
        }
        Node newtail=tail.prev;
        newtail.next=null;
        tail.prev=null;

        return head;

      
    }

    public static Node deleteKthNode(Node head,int k){
        if (head==null || k<=0) {
            return null;
            
        }
        if (k == 1) {
            return deleteHead(head);
        } 
        int cnt=1;
        Node knode=head;
        while (knode != null && cnt<k) {
            knode=knode.next;
            cnt++;
            // if (cnt==k) {
            //     break;
                
            // }
            
        }

        if (knode == null) {
            // Position k is greater than the number of nodes
            return head;
        }

        Node front =knode.next;
        Node back=knode.prev;

        if (back==null && front==null) {
            return null;
            
        } 
        else if(back==null){
            return deleteHead(head);

        }
        else if(front==null){
            return deleteTail(head);
        }
        back.next=front;
        front.prev=back;
        knode.next=null;
        knode.prev=null;

        return head;
            
    }
    
    public static Node insertbeforeHead(Node head,int val){
        Node newhead=new Node(val,head,null);
        head.prev=newhead;
        return newhead;

    }
    
    public static Node insertbeforetail(Node head,int val){
        if (head.next == null) {
            return insertbeforeHead(head, val);
            
        }
        Node tail=head;
        while (tail.next != null) {
            tail=tail.next;
            
        }

        Node back=tail.prev;
        Node newnode=new Node(val, tail, back);
        back.next=newnode;
        tail.prev=newnode;

        return head;
    }
    
    public static Node insertKthelement(Node head,int val,int k){
        if (k==1) {
            return insertbeforeHead(head, val);
            
        }
        Node temp=head;
        int cnt=0;
        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp=temp.next;
            
        }
        Node back=temp.prev;
        Node newnode=new Node(val, temp, back);
        back.next=newnode;
        temp.prev=newnode;

        return head;

    }
    
    public static void insertbeforeNode(Node node,int val){
        Node back=node.prev;
        Node newNode=new Node(val, node, back);
        back.next=newNode;
        node.prev=newNode;
    }
    
    public static void print(Node head){
        while (head != null) {
            System.out.println(head.data);
            head=head.next;
            
        }
    }

    public static void main(String[] args) {
        int arr[]={12,5,6,8};
        Node head=convertArrtoDll(arr);

        head=deleteHead(head);
        print(head);
    }
   
    
}
