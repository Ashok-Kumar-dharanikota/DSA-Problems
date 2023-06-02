import java.util.Arrays;
public class Problem_2 {

    public static void main(String[] args) {
        
        int[] arr = {2,6,7,83,3,0,9};

        int n = arr.length;

        QuickSort(arr,0,n-1);

        System.err.println(Arrays.toString(arr));
    }

    private static void QuickSort(int[] arr, int low, int high) {

        if(low < high){
            int pindex = partition(arr,low,high);

            QuickSort(arr, low, pindex-1);
            QuickSort(arr, pindex+1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;

    }
}
