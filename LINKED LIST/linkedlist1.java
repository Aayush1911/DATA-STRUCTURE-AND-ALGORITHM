public class linkedlist1 {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        // 1.create a new node
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            return;
        }

        // 2.newnode next = head
        newnode.next = head;

        // 3.head = newnode
        head = newnode;

    }

    public void lastadd(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
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

    public void add(int idx, int data) {

        if (idx == 0) {
            addfirst(data);
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        tail = prev;
        prev.next = null;
        size--;
        return val;
    }

    public int iterativesearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursivesearch(int key) {
        return helper(head, key);
    }

    public void reversell() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deletenthfromend(int n) {
        Node prev = head;
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = sz - n;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // find middle
        Node mid = findmid(head);
        // reverse 2nd half
        Node curr = mid;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // check if equal
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean iscycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = head.next;
            fast = head.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }
    public static void removecycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = head.next;
            fast = head.next.next;
          
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
            if(cycle == false){
                return;
            }
        //find meeting point 
            slow = head;
            Node prev = null;
            while(fast!=slow){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
        //remove cycle - last.next = prev
        prev.next = null;
    }
private Node getmid(Node head){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
private Node merge(Node head1 , Node head2){
    Node mergedll = new Node(-1);
    Node temp = mergedll;
    while(head1!=null && head2 != null ){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        else{
            temp.next = head2;
            head2.next = head2;
            temp = temp.next;
        }
    }
    while(head1!=null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }
    while(head2!=null){
        temp.next = head2;
            head2.next = head2;
            temp = temp.next;
    }
    return mergedll.next;
}
    public Node mergesort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find midnode
        Node mid = getmid(head);
        //left and right part sort
        Node righthead = mid.next;
        mid.next = null;    
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
        //merge sort
        return merge(newleft , newright);
    }

    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast !=  null && fast.next != null){
            slow = slow.next;   
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //alternate merging
        Node left = head;
        Node right = prev;
        Node nextL , nextR;
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;  
        }
    }
       

    public static void main(String args[]) {
        /*
         * // linkedlist1 ll = new linkedlist1();
         * // ll.print();
         * // ll.addfirst(2);
         * // ll.print();
         * // ll.addfirst(1);
         * // ll.print();
         * // ll.lastadd(4);
         * // ll.print();
         * // ll.lastadd(5);
         * // ll.print();
         * // ll.add(2,3);
         * // ll.print();
         * // System.out.println("size is " + ll.size);
         * // ll.removefirst();
         * // ll.print();
         * // System.out.println("size is " + ll.size);
         * // ll.removelast();
         * // ll.print();
         * // System.out.println("size is " + ll.size);
         * // System.out.println("index is " + ll.iterativesearch(4));
         * // System.out.println("index is " + ll.recursivesearch(10));
         * // ll.reversell();
         * // ll.print();
         * // ll.deletenthfromend(3);
         * // ll.print();
         * // ll.addfirst(1);
         * // ll.addfirst(2);
         * // ll.addfirst(2);
         * // ll.addfirst(1);
         * // ll.print();
         * // System.out.println(ll.checkpalindrome());
         */

        /*head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(iscycle());*/
        

        
        linkedlist1 ll = new linkedlist1();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        ll.zigzag();
        ll.print();
       /* 
        ll.head = ll.mergesort(ll.head);
        ll.print();*/
 
 
 
 
 
    }
}
