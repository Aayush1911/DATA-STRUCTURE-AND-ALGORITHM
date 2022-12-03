import java.util.*;
public class stack {
   /*  static class stack1{
        static ArrayList<Integer>list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    */
    static class Node{
        int data;
        Node next;
            Node (int data){
                this.data = data;
                this.next=null;
            }
    }
    static class stack2{
        static Node head  = null;
        //isempty
        public static boolean isEmpty(){
            return head == null;
        }
        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;

        }
        //pop
        public static int pop(){
            if(isEmpty()){
                
                return -1;
            }
            int top = head.data;
            return top;
        }
    //peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    }
   
    
      
     @SuppressWarnings("unchecked")
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){    
            System.out.println(s.peek());
            s.pop();
        }


    }
}
