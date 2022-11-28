public class QUICKSORT {
    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }




 
        int pidx = partition(arr, si, ei);
        System.out.println(pidx);
        quicksort(arr, si, pidx - 1);
        quicksort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivort = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivort) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivort;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        //3,2,5,8,6,9
        quicksort(arr, 0, arr.length - 1);
        print(arr);
    }
}