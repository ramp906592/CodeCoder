class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int profit = 0;
        int buy = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<buy){
                buy = arr[i];
            }
            else if(arr[i]-buy > profit){
                profit = arr[i] -buy;
            }
        }
        return profit;
    }
}