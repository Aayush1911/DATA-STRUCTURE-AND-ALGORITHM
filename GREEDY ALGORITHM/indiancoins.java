import java.util.*;
public class indiancoins {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins , Comparator.reverseOrder());
        int countofcoin=0;
        int amount=590;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            while(coins[i]<=amount){
                countofcoin++;
                ans.add(coins[i]);
                amount -= coins[i];
            }
        }
        System.out.println("total coins used =" + countofcoin );
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
