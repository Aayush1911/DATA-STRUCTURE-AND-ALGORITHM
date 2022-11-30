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
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        // 1.create a new node
        Node newnode = new Node(data);
        size++;
       

        if(head == null){
            head = tail = newnode;
            return;
        }

        //2.newnode next = head
        newnode.next = head;
        

        //3.head = newnode
        head = newnode;



    }
    public void lastadd(int data){
        Node newnode = new Node(data);
        size++;
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
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("NULL");
}



public void add(int idx , int data){
   
    if(idx==0){
        addfirst(data);
    }
    Node newnode = new Node(data);
    size++;
    Node temp = head;
    int i=0;
    while(i<idx-1){
         temp = temp.next;
         i++;
    }
    newnode.next = temp.next;
    temp.next = newnode;
}

public int removefirst(){
    if(size==0){
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
}

public int removelast(){
    if(size==0){
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }
    Node prev = head;
    for(int i=0;i<size-2;i++){
        prev = prev.next; 
    }
    int val = tail.data;
    tail = prev;
    prev.next = null;
    size--;
    return val;
}

public int iterativesearch(int key){
    Node temp = head;
    int i=0;
    while(temp!= null){
        if(temp.data == key){
            return i;   
        }
        temp = temp.next;
        i++;
    }
    return -1;
}
public int helper(Node head , int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx = helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
public int recursivesearch(int key){
   return helper(head, key);
}
public void reversell(){
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
}





public static void main(String args[]){
        linkedlist1 ll = new linkedlist1();
        //ll.print();
        ll.addfirst(2);
        //ll.print();
        ll.addfirst(1);
        //ll.print();
        ll.lastadd(4);
        //ll.print();
        ll.lastadd(5);
        //ll.print();
        ll.add(2,3);
        ll.print();
        //System.out.println("size is " + ll.size);
        //ll.removefirst();
        //ll.print();
        //System.out.println("size is " + ll.size);
        //ll.removelast();
        //ll.print();
       // System.out.println("size is " + ll.size);
        //System.out.println("index is " + ll.iterativesearch(4));
        //System.out.println("index is " + ll.recursivesearch(10));
        ll.reversell();
        ll.print();
}
}
