import java.util.LinkedList;
public class linkedlist2 {
    public static void main(String args[]){
        //create
        LinkedList<Integer>ll = new LinkedList<>();

        //add
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
    }
}
