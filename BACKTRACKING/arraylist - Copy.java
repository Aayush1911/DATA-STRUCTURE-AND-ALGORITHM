import java.util.*;
public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer>  list1 = new ArrayList<>();
        ArrayList<Float>  list2 = new ArrayList<>();
        ArrayList<String>  list3 = new ArrayList<>();
        //operations
        //add element
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.add(2,5);
        System.out.println(list1);
        //get element
        /*int element = list1.get(2);
        System.out.println(element);*/
        //remove element 
        /*list1.remove(2);
        System.out.println(list1);*/

        //SET ELEMENT
         /*  list1.set(2,10);
        System.out.println(list1);*/

        //contain element
        // System.out.println(list1.contains(2));
        // System.out.println(list1.contains(15));

        //size of element
        // System.out.println(list1.size());
        // for(int i=0;i<list1.size();i++){
        //     System.out.print(list1 .get(i) + " ");
        // }
        // System.out.println();

        //reverse the arraylist
        // for(int i=list1.size()-1;i>=0;i--){
        //     System.out.print(list1.get(i) + " ");
        // }
        // System.out.println();

        //max
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list1.size();i++){
        //     // if(list1.get(i)>max){
        //     //     max = list1.get(i);
        //     // }
        //     max = Math.max(max, list1.get(i));
        // }
        // System.out.println(max);

        //swap two number

        // int temp = list1.get(2);
        // list1.set(2 , list1.get(3));
        // list1.set(3 , temp);
        // System.out.println(list1);
        
        //sorting arraylist
        //  Collections.sort(list1);
        // System.out.println(list1);
        // Collections.sort(list1 , Collections.reverseOrder());
        // System.out.println(list1);


    }
}
