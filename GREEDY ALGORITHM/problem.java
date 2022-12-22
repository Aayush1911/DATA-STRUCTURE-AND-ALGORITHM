import java.util.*;
public class problem {
    /* 
    public static void maxbalancedstring(String str){
        int l=0,r=0;
        int ans=0;
        if(str.length()==0){
            return;
        }
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)=='L'){
                l++;
            }
            else if(str.charAt(i)=='R'){
                r++;
            }
            if(r==l){
                getans.add(str.charAt(i));
                ans++;
            }
        }
        System.out.println("max balnced substring = " + ans);
       
    }
    */
    public static void largestoddnuminrange(int range[],int k){
        Integer arr[] = new Integer[4];
        for(int i=0;i<range.length;i++){
            if(range[i] % 2 != 0){
                arr[i] = range[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        Arrays.sort(arr,Collections.reverseOrder());
        
        

    }
    public static void main(String args[]){
        //Maximum Balanced String Partitions
        String str = "LRRRRLLRLLRL";
        //maxbalancedstring(str);
        //Kth largest odd number in a given range
        int  k=1;
        int range[] = {-3,-2,-1,0,1,2,3};
        largestoddnuminrange(range,k);
    }
}
