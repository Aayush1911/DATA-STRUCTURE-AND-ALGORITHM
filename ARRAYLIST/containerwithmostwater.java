import java.util.*;

public class containerwithmostwater {
    public static void  bruteforce(ArrayList<Integer>height){
        int max = 0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int wt = j - i;
                int a = ht * wt;
                max = Math.max(max, a);
                
            }
        }
        System.out.println(max);
        
    }
    public static void lineartc(ArrayList<Integer>height){
        int lp = 0;
        int rp = height.size()-1;
        int max =0;
        while(lp<rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp - lp;
            int a = ht * wt;
            max = Math.max(a, max);
            if(height.get(lp)>height.get(rp)){
                rp--;
            }
            else{
                lp++;
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        //bruteforce(height);  //0(n^2)
        lineartc(height); // 0(n)
    }
}
