import java.util.*;
public class bitmanupalution{
    public static void oddeven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
public static void getithbit(int n , int i){
    int bitmask =  1<<i;
    if((n & bitmask) == 0){
        System.out.println("0");
    }
    else{
        System.out.println("1");
    }
}
public static int setithbit(int n,int i){
int bitmask = 1<<i;
return n | bitmask;
}
public static int  clearithbit(int n,int i){
    int bitmask = ~(1<<i);
    return n & bitmask;
}
public static int updatebit(int n,int i,int newbit){
    if(newbit == 0){
        return clearithbit(n, i);
    }
    else{
        return setithbit(n, i);
    }
}
public static void clearibit(int n , int i){
    int bitmask = (~0)<<i;
    System.out.println(n & bitmask);
}
public static void clearrangeofbit(int n , int i , int j){
    int a = (~0)<<j+1;
    int b= (1<<i) - 1;
    int bitmask = a | b;
    System.out.println(n & bitmask);
}
public static boolean ispowertwo(int n){
    return (n & (n-1)) == 0;
}
public static int countbit(int n){
    int count =0;
    while(n>0){
        if((n & 1) != 0){
            count++;
        }
        n = n>>1;
    }
    return count;
}
public static int fastexponenetaion(int a , int n){
    int ans =1;
    while(n>0){
        if((n & 1) != 0){
        ans = ans * a;
        }
        a = a * a;
        n= n>>1;
    }
return ans;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
//System.out.println(5 & 6);
//System.out.println(5 | 6);
//System.out.println(5 ^ 6);
//System.out.println(~6);
//System.out.println(5 << 2);
//System.out.println(20 >> 2);
//oddeven(5);
//getithbit(15, 2);
//setithbit(6, 3);
//clearithbit(10, 1);
//System.out.println(updatebit(10, 2, 1));
//clearibit(15, 2);
//clearrangeofbit(10, 2, 4);
//System.out.println(ispowertwo(4));
//System.out.println(countbit(16));
System.out.println(fastexponenetaion(5, 3));


}
}