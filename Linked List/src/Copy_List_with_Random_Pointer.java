class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Copy_List_with_Random_Pointer {
    // public Node copyRandomList(Node head) {
    //     Node temp=head;
    //     HashMap<Node,Node> map=new HashMap<>();
    //     while(temp !=null){
    //         Node newnode=new Node(temp.val);
    //         map.put(temp,newnode);
    //         temp=temp.next;

    //     }
    //     temp=head;
    //     while(temp !=null){
    //         Node copynode=map.get(temp);
    //         copynode.next=map.get(temp.next);
    //         copynode.random=map.get(temp.random);
    //         temp=temp.next;
    //     }
    //     return map.get(head);
        
    // }
    public void insertCopyinBW(Node head){
        Node temp=head;
        while(temp!=null){
            Node copynode=new Node(temp.val);
            copynode.next=temp.next;
            temp.next=copynode;
            temp=temp.next.next;
        }
    }
    public void connectRandomPointer(Node head){
        Node temp=head;
        while(temp != null){
            Node copynode=temp.next;
            if(temp.random!=null){
                copynode.random=temp.random.next;
            }
            else{
                copynode.random=null;
            }
            temp=temp.next.next;
        }

    }

    public Node getCopyList(Node head){
        Node temp=head;
        Node clnode=new Node(-1);
        Node res=clnode;

        while(temp !=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
        }

        return clnode.next;
    }


    public Node copyRandomList(Node head) {
        if(head==null) return null;
        insertCopyinBW(head);
        connectRandomPointer(head);
        return getCopyList(head);


    }
}
