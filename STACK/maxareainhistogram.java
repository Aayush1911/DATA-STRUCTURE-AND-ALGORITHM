import java.util.*;
public class maxareainhistogram {
    public static void maxarea(int arr[]){
        int maxarea=0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        //next smaller right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
            System.out.print(nsr[i]);
        }
        System.out.println();
        
        //next smaller left
        s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
            System.out.print(nsl[i]);
        }
        System.out.println();
        //area
        for(int i=0;i<arr.length;i++){
        int height = arr[i];
        int width = nsr[i] - nsl[i] -1;
        int area = height * width;
        maxarea = Math.max(maxarea, area);
        }
        System.out.println(maxarea);
    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        maxarea(arr);

    }
}
