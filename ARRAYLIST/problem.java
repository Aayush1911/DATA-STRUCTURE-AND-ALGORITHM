import java.util.*;
public class problem {
    public static boolean mono_list(ArrayList<Integer> monolist){
        boolean inc = true ; boolean dec = true;
        for(int i=0 ;i<monolist.size()-1;i++){
            if(monolist.get(i)>monolist.get(i+1)){
                inc = false;
            }
            if(monolist.get(i+1)>monolist.get(i)){
                dec = false;
            }
            }
        
        return inc || dec;
    }

public static int lonelynum(ArrayList nums){
    int n;
    for(int i=0;i<nums.size()-1;i++){
        ArrayList<Integer>list = new ArrayList<>();
        Collections.sort(nums);
        if(nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)) {
            list.add(nums.get(i));
        }
    }
if(nums.size() == 1){
    list.add(nums.get(0));
}
if(nums.size()>1){
    if(nums.get(0) + 1 <nums.get(1)){
        list.add(nums.get(0));
    }
    if(nums.get(nums.size())-2 + 1 < nums.get(nums.size()-1)){
        list.add(nums.get(nums.size()-1));
    }
}
return list;
}

    public static void main(String args[]){
       //monolist incresing and decreasing
        ArrayList<Integer>monolist = new ArrayList<>();
        monolist.add(5);
        monolist.add(6);
        monolist.add(7);
        monolist.add(8);
        monolist.add(9);
        //System.out.println(mono_list(monolist));

        ArrayList <Integer>nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(lonelynum(nums));
    
    }
}
