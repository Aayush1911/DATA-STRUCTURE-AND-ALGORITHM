import java.util.*;
public class queueusingtwostack {
    static class queue{
        static Stack<Integer>s1 = new Stack<>();
        static Stack<Integer>s2 = new Stack<>();
        //by push 
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add 0(n)
        
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove 0(1)
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
            }
            return s1.pop();
        }
        
        //peek
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
            }
            return s1.peek();
        }

        //by pop
        /* 
        public static void add(int data){
            if(!s1.isEmpty()){
                s1.push(data);
            }
            else{
                s2.push(data);
            }
        }
        public static int remove(){
            int x;
           if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("queue empty");
           }
           if(s2.isEmpty()){
            while(!s1.isEmpty()){
                x = s1.pop();
                s2.push(x);
            }
           }
           x=s2.pop();
           return x;
        }*/
    }
    public static void main(String args[]){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
      
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
