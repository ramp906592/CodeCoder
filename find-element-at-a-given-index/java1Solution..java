class CodeCoder {
    public int findElement(int[] arr, int index) {
        int n = arr.length;
        if(index>0 && index>n){
            return -1;
        }
        for (int i=0;i<n;i++){
            if(i==index){
                return arr[i];
            }
        }
        return -1;
    }
}