class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
    Node(int a ,Node next){
        data=a;
        this.next=next;
    }
}

public class LinkedList {

    public static Node arraytoLL(int arr[]) {
       
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        
        return head;
    }

     public static int getlength(Node head){
             Node temp=head;
             int cnt=0;
             while(temp != null){
                 temp=temp.next;
                 cnt++;
             }
             return cnt;
         }

       public static boolean searchKey(int n, Node head, int key) {
            Node temp=head;
            while(temp != null){
                if( temp.data == key) return true;
                temp=temp.next;   
            }
            return false;
        }

        public static Node removek(Node head,int k){
            if (head==null) return head;
            if(k==1){
                head=head.next;
                return head;
            }
            int cnt=0;
            Node temp=head;
            Node prev=null;
            while (temp != null) {
                cnt++;
                if (cnt == k) {
                    prev.next=prev.next.next;
                    break;
                }
                prev=temp;
                temp=temp.next;
                
            }
            return head;
        }

        public static Node inserthead(Node head,int val){
            Node temp=new Node(val,head);
            return temp;
        }
        
        public static Node InsertTail(Node head,int val){
            if (head==null) {
                return new Node(val);
            }
            Node temp=head;
            while (temp.next != null) {
                temp=temp.next;  
            }
            Node newNode=new Node(val);
            temp.next=newNode;
            return head;
        }

        public static Node insetPositon(Node head,int el,int k){
            if(head==null){
                if(k==1){
                    return new Node(el);
                }
                else return head;
            }
            if (k==1) {
                return new Node(el, head);
                
            }
            int cnt=0;
            Node temp=head;
            while (temp != null) {
                cnt++;
                if (cnt==k-1) {
                    Node x=new Node(cnt, temp.next);
                    temp.next=x;
                    break;
                    
                }
                temp=temp.next;
                
            }
            return head;
        }

        public static Node insertPositon(Node head,int el,int val){
            if(head==null){
               return null;
            }
            if (head.data==val) {
                return new Node(el, head);
                
            }
            
            Node temp=head;
            while (temp != null) {
                
                if (temp.next.data==val) {
                    Node x=new Node(el, temp.next);
                    temp.next=x;
                    break;
                    
                }
                temp=temp.next;
                
            }
            return head;
        }

        public static void print(Node head){
            Node temp=head;
            while (temp != null) {
                System.out.println(temp.data);
                temp=temp.next;
                
            }
            return;
        }

    public static void main(String[] args) {
        int arr[]={12,5,8,7};
        Node head=arraytoLL(arr);
        head=InsertTail(head, 5);
        print(head);
        
        
    }
}