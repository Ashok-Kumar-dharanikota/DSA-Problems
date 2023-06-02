class Problem_3 {

    public static void main(String[] args) {
        
        int Arr[] = {2, 4, 8, 10, 12, 14};
        int n = Arr.length;

        System.out.println(findMissing(Arr, n));


    }


   static int findMissing(int[] arr, int n) {
        // code here
        int a=arr[0];
        int d=(arr[n-1]-a)/n;
        for(int i=0;i<n;i++){
            if((a+i*d)!=arr[i])return (a+i*d);
        }
        return -1;
    }
}
