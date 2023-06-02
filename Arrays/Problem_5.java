public class Problem_5 {
    public static void main(String[] args) {
        
        int[] arr = {2,6,7,83,3,0,9};
        int n = arr.length;
        int max = arr[0], min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.err.println(max+" "+min);

    }
}
