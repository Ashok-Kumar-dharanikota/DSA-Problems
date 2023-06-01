import java.util.Arrays;

public class ProblemFour {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] newarr = new int[n];
        newarr[0] = arr[n-1];
        
        for(int i=0;i<n-1;i++){
            newarr[i+1] = arr[i];
        }
        for(int j=0;j<n;j++){
            arr[j] = newarr[j];
        }
   
        System.err.print(Arrays.toString(arr));
    }
}
