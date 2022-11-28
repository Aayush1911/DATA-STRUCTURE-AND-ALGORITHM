import java.util.LinkedList;

public class linkedlist1 {
    class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
    public static Node head;
    public static Node tail;
        }


        head = newnode;
    public void lastadd(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
public void print(){
    if(head == null){
        System.out.println("linkedlist is empty");
        return;
    }
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + " ->");
        temp = temp.next;
    }
    System.out.println("NULL");
}
    public static void main(String args[]){
        linkedlist1 ll = new linkedlist1();
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.lastadd(3);
        ll.print();
        ll.lastadd(4);
        ll.print();
}
}
