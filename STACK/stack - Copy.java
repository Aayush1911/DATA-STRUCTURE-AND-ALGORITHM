import java.util.*;
public class stack {
    //IMPLEMENTING STACK BY ARRAYLIST
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
    //IMPLEMENTING STACK BY LINKED LIST
    /* 
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
   */
    public static void pushatbottom(Stack<Integer>s1 , int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top = s1.pop();
        pushatbottom(s1, data);
        s1.push(top);
    }

    public static String reversestring(String str){
        Stack<Character>s = new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
      
    public static void reversestack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushatbottom(s, top);
    }
    public static void printstack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }









     @SuppressWarnings("unchecked")
    public static void main(String args[]){
       // Stack s = new Stack();
       /*Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){    
            System.out.println(s.peek());
            s.pop();
        }*/
        /*Stack<Integer>s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        pushatbottom(s1, 4);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }*/
        // String str = "helloworld!";
        // System.out.println(reversestring(str));

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3,2,1
        reversestack(s);
        printstack(s);
       


    }
}
