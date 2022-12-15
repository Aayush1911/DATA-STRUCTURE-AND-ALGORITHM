import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class array {

    /*
     * public static void update(int marks[])
     * 
     * for (int i = 0; i < marks.length; i++) {
     * marks[i] = marks[i] + 1;
     * }
     * }
     */

    /*
     * public static int linearsearch(int data[] , int key){
     * for(int i=0;i<data.length;i++){
     * if(data[i] == key){
     * return i;
     * }
     * }
     * 
     * return -1;
     * }
     */

    /*
     * public static void linear_search(String menu[] , String key , int rupees[]){
     * for(int i=0;i<menu.length;i++){
     * if(menu[i] == key){
     * System.out.println("menu number is " + (i+1));
     * System.out.println("rupees is " + rupees[i]);
     * 
     * }
     * }
     * 
     * }
     */

    /*
     * public static void largesmall(int num[]){
     * int largest = Integer.MIN_VALUE;// -infinity
     * int smallest = Integer.MAX_VALUE;// infinity
     * for(int i=0;i<num.length;i++){
     * if(largest < num[i]){
     * largest = num[i];
     * }
     * if(smallest>num[i]){
     * smallest = num[i];
     * }
     * }
     * System.out.println("largest is " + largest);
     * System.out.println("Smallest is " + smallest);
     * }
     */

    
      public static int binarysearch(int num[],int key){
      int start = 0; int end = num.length - 1;
    //  int num[] = {1,3,6,9,11,13,15,18};
      //int key = 11;
    
      while(start<=end){
      int mid = (start + end) / 2;
      System.out.println("mid is " + mid);
      if(num[mid] == key){
      return mid;
      }
      if(num[mid] > key){
      end = mid - 1;
      }
      else{
      start = mid + 1;
      }
     }
     return -1;
     }
     

    /*
     * public static void reverse(int num[]){
     * int first = 0 , last = num.length-1;
     * while(first<last){
     * int temp = num[first];
     * num[first] = num[last];
     * num[last] = temp;
     * first++;
     * last--;
     * }
     * }
     * 
     */

    /*
     * public static void pairs(int num[]){
     * int count = 0;
     * for(int i=0;i<num.length;i++){
     * int curr = num[i];
     * for(int j =i+1;j<num.length;j++){
     * System.out.print("(" + curr + "," + num[j] + ")" + " ");
     * count++;
     * }
     * System.out.println();
     * }
     * System.out.println("total pair is " + count);
     * }
     */

    /*
     * public static void subarray(int num[]){
     * int count =0;
     * int max = Integer.MIN_VALUE;
     * 
     * for(int i=0;i<num.length;i++){
     * for(int j=i;j<num.length;j++){
     * int currsum = 0;
     * for(int k=i;k<=j;k++){
     * // System.out.print(num[k] + " ");
     * currsum += num[k];
     * 
     * 
     * }
     * System.out.println(currsum);
     * if(max < currsum){
     * max = currsum;
     * }
     * count++;
     * System.out.println();
     * 
     * }
     * System.out.println();
     * }
     * System.out.println("max sum is " + max);
     * //System.out.println("total number of sub array is " + count);
     * }
     */
    /* public static void prefixmaxsubarray(int num[]) {
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        int max = Integer.MIN_VALUE;
        System.out.print(prefix[0] + " ");
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
            System.out.print(prefix[i] + " ");
        }

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (max < currsum) {
                    max = currsum;
                }
                
            }

        }
        System.out.println("max subarray is " + max);
    } */

public static void kadanes(int num[]){
    int currsum=0;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
        currsum = currsum + num[i];
        if(currsum < 0){
            currsum = 0;
        }

        max = Math.max(currsum , max);
    }
    System.out.println("max subarray is " + max);
}





    // main function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        /*
         * int marks[] = new int [5];
         * marks[0] = sc.nextInt();
         * marks[1] = sc.nextInt();
         * marks[2] = sc.nextInt();
         * marks[3] = sc.nextInt();
         * marks[4] = sc.nextInt();
         * 
         * System.out.println("phy " + marks[0]);
         * System.out.println("maths " + marks[1]);
         * System.out.println("chem " + marks[2]);
         * System.out.println("eng " + marks[3]);
         * System.out.println("comp " + marks[4]);
         * 
         * marks[4] = marks[0] + 2;
         * System.out.println(marks[4]);
         * 
         * System.out.println("length of array is " + marks.length);
         */
        // pass by reference
        /*
         * int marks[] = { 97, 98, 99 };
         * update(marks);
         * for (int i = 0; i < marks.length; i++) {
         * System.out.println(marks[i] + " ");
         * }
         */
        // linear search

        
          //int data[] = {1,2,3,4,5};
          //int key = 3;
         // int index = linearsearch(data , key);
          //if(index == -1){
          //System.out.println("not found");
          //}
          //else{
          //System.out.println("index is " + index);
          //}
         

        /*
         * String menu[] = {"dhosa", "idli","Samosa","pizza","sandwich"};
         * String key = "Samosa";
         * int rupees[] = {100,80,50,120,60};
         * linear_search(menu,key,rupees);
         */

        // largest and smallest of array
        /*
         * int num[]={5,4,2,7,9,1};
         * largesmall(num);
         */

        // binary search
        
          int num[] = {1,3,6,9,11,13,15,18};
          int key = 11;
          
        System.out.println("index is " + binarysearch(num,key));
         
         

        // reverse of array
        /*
         * int num[] = {2,4,6,8,10};
         * reverse(num);
         * for(int i=0;i<num.length;i++){
         * System.out.print(num[i] + " ");
         * }
         */

        // pairs of array
        /*
         * int num[] = {2,4,6,8,10};
         * pairs(num);
         */

        // subarray
        //int num[] = { 2, 4, 6, 8, 10 };
        // subarray(num);
        //prefixmaxsubarray(num);

//int num[] = {-2,-3,4,-1,-2,1,5,-3};
//kadanes(num);



    }

}
