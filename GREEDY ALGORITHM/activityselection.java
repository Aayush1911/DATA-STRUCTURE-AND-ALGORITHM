import java.util.*;
public class activityselection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //when end is sorted
        /* 
        ArrayList<Integer>ans = new ArrayList<>();
        int maxact=0;
        //1st activity
        maxact = 1;
        ans.add(0);
        int lastend = end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                maxact++;
                ans.add(i);
                lastend = end[i];
            }
        }

        System.out.println("maxactivity = " + maxact);
        for(int i=0;i<ans.size();i++){
        System.out.print("A" + ans.get(i) +" ");
        }
        */
        //when end is not sorted
       //sorting the end
       int activities[][] = new int[start.length][3];
       for(int i=0;i<start.length;i++){
        activities[i][0] = i;
        activities[i][1] = start[i];
        activities[i][2] = end[i];
       }
       //llamda function 
       Arrays.sort(activities,Comparator.comparingDouble(o ->  o[2]));
       


        ArrayList<Integer>ans = new ArrayList<>();
        int maxact=0;
        //1st activity
        maxact = 1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastend){
                maxact++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }

        System.out.println("maxactivity = " + maxact);
        for(int i=0;i<ans.size();i++){
        System.out.print("A" + ans.get(i) +" ");
        }
    }
}
