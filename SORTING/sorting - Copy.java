import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;
public  class sorting{
    
    // bubble sorting
    /* public static void bubblesorting(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    */
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i] + " ");
        }
    }
     
   
     // selection sorting
    
     /* public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
        
            //System.out.print(minpos + " ");
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
     } */
   
// insertion sort
public static void insertionsort(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr = arr[i];
        int prev = i-1;
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
arr[prev+1] = curr;
    }
}

public static void countingsort(int arr[]){
int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
max = Math.max(arr[i], max);
}
System.out.println("range is upto" + max);
int count[] = new int[max+1];
for(int i=0;i<arr.length;i++){
count[arr[i]]++;
//System.out.println(arr[i]);
}
int j=0;
for(int i=0;i<arr.length;i++){
    while(count[i]>0){
        arr[j] = i;
        j++;
        count[i]--;
    }
}
}



   
     public static void main(String[] args){
int arr[] = {1,4,1,3,2,4,3,7};
/* bubblesorting(arr);
    printarr(arr);
 */
/* selectionsort(arr);
printarr(arr);
 */   
  insertionsort(arr);
//printarr(arr);
  

//Arrays.sort(arr);
//Arrays.sort(arr,0,3);
//Arrays.sort(arr,Collections.reverseOrder( ));
//Arrays.sort(arr,0,3,Collections.reverseOrder());
//countingsort(arr);
printarr(arr);



}
}