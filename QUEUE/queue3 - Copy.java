import java.util.Queue;

//import java.util.*;
public class queue3 {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class Queue{
        static node head = null;
        static node tail = null;
       
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        //add
        public static void add(int data){
            node newnode = new node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next = newnode;
            tail=newnode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            //single element
            if(tail == head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

    }
   
    public static void main(String args[]){
   Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
