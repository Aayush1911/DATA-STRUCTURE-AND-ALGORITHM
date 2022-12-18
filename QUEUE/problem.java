import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class problem {
    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.print(s1 + "  ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void reversekthelement(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        if (q.isEmpty() == true || k > q.size()) {
            return;
        }
        if (k <= 0) {
            return;
        }
        for (int i = 0; i < k; i++) {
            s.push(q.peek());
            q.remove();
        }
        while (!s.isEmpty()) {
            q.add(s.peek());
            s.pop();
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.peek());
            q.remove();
        }
    }

    public static void maxsubarrayofsizek(int arr[], int n, int k) {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int i;
        for (i = 0; i < k; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
        }
        for (; i < n; ++i) {
            System.out.print(arr[Qi.peek()] + " ");
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();
            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
        }
        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String args[]) {
        /*
         * int n = 10;
         * // generatePrintBinary(n);
         * Queue<Integer>q = new LinkedList<>();
         * q.add(10);
         * q.add(20);
         * q.add(30);
         * q.add(40);
         * q.add(50);
         * q.add(60);
         * q.add(70);
         * q.add(80);
         * q.add(90);
         * q.add(100);
         * int k=5;
         * reversekthelement(q,k);
         * while(!q.isEmpty()){
         * System.out.println(q.peek());
         * q.remove();
         */
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        maxsubarrayofsizek(arr, arr.length, k);

    }
}
