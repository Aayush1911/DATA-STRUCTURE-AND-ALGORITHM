import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class twodarray{

public static boolean search(int matrix[] [], int key){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
            if(matrix[i] [j] == key){
                System.out.print("cell is " + "(" + i + "," + j + ")");
                return true;
            }
        }
    }
    System.out.println("not found");
    return false;
}
public static void maxmin(int matrix[] []){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
           // max = Math.max(max, matrix[i][j]);
            //min = Math.min(min , matrix[i][j]); 
        if(max<matrix[i][j]){
            max = matrix[i][j];
        }
        if(min>matrix[i][j]){
            min = matrix[i][j];
        }
        
        }

    }
    System.out.println();
    System.out.println("max is " + max);
    System.out.println("min is " + min);
}

public static void spiralmatrix(int arr[] []){
    int startrow=0;
    int endrow = arr.length-1;
    int startcol=0;
    int endcol= arr[0].length-1;
    while(startrow<=endrow && startcol<=endcol){
    //top
        for(int i=startcol;i<=endcol;i++){
            System.out.print(arr[startrow][i] + " ");
        }
    //right
        for(int j=startrow+1;j<=endrow;j++){
            System.out.print(arr[j][endcol] + " ");
        }
    //bottom
        for(int i=endcol-1;i>=startcol;i--){
             if(startrow == endrow){
                break;
            }
           
  System.out.print(arr[endrow][i] + " ");
        }
    //left
        for(int j=endrow-1;j>=startrow+1;j--){
            System.out.print(arr[j][startcol] + " ");
        }
        startcol++;
        startrow++;
        endrow--;
        endcol--;
        System.out.println();
    }      
} 

public static int diagonalsum(int arr[][]){
    int sum=0;
    /* for(int i=0;i<arr.length;i++){ 
                for(int j=0;j<arr[0].length;j++){
            if(i == j){
            sum+=arr[i][j];
            }
            else if(i+j == arr.length-1){
                sum+=arr[i][j];
            }
        }
    }
    return sum;

 */

for(int i=0;i<arr.length;i++){
    sum+= arr[i][i];
    if(i != arr.length-1-i){
    sum+=arr[i][arr.length-1-i];
    }
}
return sum;
}
//search in sorted matrix
/* int arr[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}}; 
 */ 
public static boolean staircasesearch(int arr[][] , int key){
//index at bottom left
/* int row=arr.length-1 , col = 0;
while(row>=0 && col<arr[0].length){
    if(arr[row][col] == key){
        System.out.println("key find out at " + "(" + row + "," + col + ")");
        return true;
    }
    else if(arr[row][col]>key){
        row--;
    }
    else{
        col++;
    }
 */    

//index at top right
int row=0 , col = arr[0].length-1;
while(row<arr.length && col>=0){
    if(arr[row][col] == key){
        System.out.println("key find out at " + "(" + row + "," + col + ")");
        return true;
    }
    else if(arr[row][col]>key){
        col--;
    }
    else{
        row++;
    }

}
System.out.println("key not found");
return false;
}

public static void practise(int prac[][]){
 int count =0;
/* for(int i=0;i<prac.length;i++){
     for(int j=0;j<prac[0].length;j++){
        if(prac[i][j] == 8){
                count++;
            }
        }
    }
    System.out.print(count);
 */
/* for(int j=0;j<prac[0].length;j++){
    count+=prac[1][j];
}
System.out.println("sum is " + count);
 */
//int prac[][] = {{1,2,3,4},
  //              {5,6,7,8}};

for(int i=0;i<prac.length;i++){
    for(int j=0;j<prac[0].length;j++){
        System.out.print(prac[i][j] + " ");
    }
    System.out.println();
}




}




    public static void main(String[] args){
/* Scanner sc = new Scanner(System.in);
int matrix[] [] = new int[3] [3];
for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
        matrix[i] [j] = sc.nextInt(); 
    }
}

for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix.length;j++){
       System.out.print( matrix[i] [j] + " "); 
    }
    System.out.println();
}


search(matrix, 3);
maxmin(matrix);
 */
 int arr[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}}; 
//spiralmatrix(arr);
//diagonal sum
//System.out.println(diagonalsum(arr));
int key=13;
//staircasesearch(arr, key);

/* int prac[][] = {{4,7,8},
                {8,8,7}};
 */
/* int prac[][] = {{1,4,9}, 
                {11,4,3},
                {2,2,3}};

practise(prac);
 */

 int prac[][] = {{1,2,3,4},
                {5,6,7,8}};
int row=2,col=4;
practise(prac);

int transpose[][] = new int[col][row];

for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        transpose[j][i] = prac[i][j];
    }
}
System.out.println();
practise(transpose);


}
}
