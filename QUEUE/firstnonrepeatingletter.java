import java.util.*;
public class firstnonrepeatingletter{
        public static void firstonrepeat(String str){
            Queue<Character> q = new LinkedList<>();
            int freq[] = new int[26];
            char ch;
            for(int i=0;i<str.length();i++){
                ch = str.charAt(i);
                q.add(ch);
                freq[ch-'a']++;
                while(!q.isEmpty() && freq[q.peek()-'a']>1){
                    q.remove();
                }
                if(q.isEmpty()){
                    System.out.print(-1 + " ");
                }
                else{
                    System.out.print(q.peek() +" ");
                }
            }
            System.out.println();
        }
    public static void main(String args[]){
        String str = "aabccxb";
        firstonrepeat(str);

    }
}