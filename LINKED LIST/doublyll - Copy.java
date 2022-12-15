public class doublyll  {
    public class Node{
        int data;
        Node next;
        Node prev;
   public  Node(int data){
        this.data = data;
        this.next=null;
        this.prev = null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;
    
//add
public void addfirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
}



//remove
public int removefirst(){
    if(head==null){
        System.out.println("dll is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val = head.data;
        head = tail =null;
        size--;
        return val;
    }
    int val = head.data;
    head = head.next;
    head.prev=null;
    size--;
    return val;

}
//reverse
public void reverse_dll(){
    Node prev=null;
    Node curr=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev = next;
        prev=curr;
        curr=next;
    }
    head=prev;
} 
//print
public void print(){
    
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
}

          
    public static void main(String args[]){
        doublyll dll = new doublyll();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.addfirst(4);
        dll.print();
        System.out.println(dll.size);
        //dll.removefirst();
        //dll.print();
        //System.out.println(size);
        dll.reverse_dll();
        dll.print();
    }
}
