import java.util.*;

public class practise {
    /* public static boolean ispalindrome(int n){
int p = n;
int rev = 0;
while(p>0){
    int last = p % 10;
rev = (rev*10) + last;
p = p / 10;

}
if(n == rev){
    return true;
}
else{
    return false;
}
    }
 */
    
 /* public static boolean isnum(int num[]){
    for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
            if(num[i] == num[j]);
                System.out.println(num[i],[j]);
                return true;
            }
        }
    }
    return false;
 } */
 
 public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
 }

public static void bubblesort(int arr[]){
for(int i=0;i<arr.length-1;i++){
    int swap = 0;
    for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
swap++;
        }
    }
    if(swap == 0){
        break;
    }
 }
}


public static void selectionsort(int arr[]){
    for(int i=0;i<arr.length;i++) {
int minpos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos] > arr[j]){
minpos = j;
            }
        }
        int temp = arr[minpos];
        arr[minpos] = arr[i];
        arr[i] = temp;
    }
}

public static void insertionsort(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr = arr[i];
        int prev = i-1;
        for(int j=0;j<arr.length;j++){
while(prev>=0 && arr[prev]>curr){
    arr[prev+1] = arr[prev];
prev--;
}
arr[prev+1] = curr;
        }
    }
}







 
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*  int palindrome = sc.nextInt();
        if (ispalindrome(palindrome)) {
            System.out.println("palindome");
        } else
            System.out.println("not palindrome"); */
 
 
 
 /* int num[] = {1,2,2,4};
System.out.println(isnum(num)); */

int arr[] = {3,6,2,1,8,7,4,5,3,1};
//bubblesort(arr);

//selectionsort(arr);
insertionsort(arr);
print(arr);



}
}
