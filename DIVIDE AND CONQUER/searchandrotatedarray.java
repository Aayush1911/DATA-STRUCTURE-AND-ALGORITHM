public class searchandrotatedarray {
    public static int search(int arr[] , int tar , int si , int ei){
        int mid = si + (ei-si)/2;
        if(si>ei){
            return -1;
        }
        if(arr[mid] == tar){
            return mid;
        }
        //mid on l1
        
        if(arr[si]<=arr[mid]){
            //at left
            if(arr[si]<=tar && tar<=arr[mid]){
            return search(arr, tar, si, mid-1);
        }
        //at right
                else{
                 return search(arr, tar, mid+1, ei);
        }
    }
        // mid on l2
        else{
                
                if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //at right
                else{
                return search(arr, tar, mid+1, ei);
            }

        
    }
    }
        
    
    public static void main(String args[]){
        int arr[] = {4,5,6,1,2,3};
        int search = search(arr, 2, 0, arr.length);
        System.out.println(search);

    }
}

