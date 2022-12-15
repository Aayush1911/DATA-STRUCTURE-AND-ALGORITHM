import java.util.*;
public class 2darray{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int matrix[] [] = new int[3] [3];
for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix.length;j++){
        matrix[i] [j] = sc.nextInt; 
    }
}

for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix.length;j++){
       System.out.print( matrix[i] [j]); 
    }
    System.out.println();
}

    }
} 