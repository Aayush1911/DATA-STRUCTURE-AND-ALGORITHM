import java.util.*;
public class arraylist2 {
    public static boolean pairsum1(ArrayList<Integer>pair , int target){
        int lp = 0;
        int rp = pair.size()-1;
        while(lp<rp){
            if(pair.get(lp) + pair.get(rp) == target){
                return true;
            }
            else if(pair.get(lp) + pair.get(rp) > target){
                rp--;
            }
            else{
                lp++;
            }
            
        }
        return false;
    }


    public static boolean pairsum2(ArrayList<Integer>pair1 , int target1){
        int breakingpoint = -1;
        for(int i=0;i<pair1.size();i++){
            if(pair1.get(i) > pair1.get(i+1)){
                breakingpoint = i;
                break;
            }
        }
        int rp = breakingpoint;
        int lp = breakingpoint+1;
        int n = pair1.size();
        while(lp!=rp){
            if(pair1.get(lp) + pair1.get(rp) == target1){
                return true;
            }
            else if(pair1.get(lp) + pair1.get(rp) > target1){
                rp = (n + rp-1) % n;
            }
            else{
                lp = (lp+1) % n;
            }
        }
        return false;


    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>currlist = mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }


        // pair sum 1 sorted list
        ArrayList<Integer>pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pair.add(3);
        pair.add(4);
        pair.add(5);
        pair.add(6);

        int target = 5;
        System.out.println(pairsum1(pair, target));


        //pair sum 2 sorted and rotated list
        ArrayList<Integer>pair1 = new ArrayList<>();
        pair1.add(11);
        pair1.add(15);
        pair1.add(6);
        pair1.add(8);
        pair1.add(9);
        pair1.add(10);

        int target1 =16;
        System.out.println(pairsum2(pair1, target1));
        
        
        
    }
}
