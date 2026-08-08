class CodeCoder {
    public int pivotIndex(int[] arr) {
       int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i] += arr[i-1];
        }
        for(int i=0;i<n;i++){
            int leftsum = 0;
            if(i>0) leftsum = arr[i-1];
            int rightsum = arr[n-1] - arr[i];
            if(leftsum==rightsum) return i;
        }
        return -1;
    }
}